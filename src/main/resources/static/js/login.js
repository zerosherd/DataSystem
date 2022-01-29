let loginVM = new Vue({
    el: "#mainFrame",
    data: {
        account: "",
        password: "",
        loadingAnimate: "",
        toastMsg: document.getElementById("toastPart"),
        toastText: ""
    },
    created() {

    },
    methods: {
        loginSubmit: function () {
            if(loginVM.account !== ""){
                if(loginVM.password !== ""){
                    let i = 0;
                    loginVM.loadingAnimate = setInterval(function () {
                        loginVM.toastText = "LOADING".substr(0, i++ % 7 + 1);
                        loginVM.toastMsg = true;
                    }, 400)
                    let url = "https://localhost:8138/login"
                    let data ={
                        username: loginVM.account,
                        password: faultylabs.MD5(loginVM.password)
                    }
                    this.processData(url, data)
                }
            }else {
                loginVM.toastText = "请输入账号";
                loginVM.toastMsg = true;
                setTimeout(function () {
                    loginVM.toastMsg = false
                }, 2000);
            }
        },
        processData: function (url, data) {
            fetchPost(url, data).then(res => {
                if (res.errcode == "0") {
                    loginVM.account = "";
                    loginVM.password = "";
                    clearInterval(loginVM.loadingAnimate);
                    loginVM.toastText = "登陆成功";
                    loginVM.toastMsg = true;
                    setTimeout(function () {
                        loginVM.toastMsg = false
                    }, 2000);
                    sessionStorage.setItem("userData", JSON.stringify(res.data));
                    location.replace("../main/main.html");
                } else {
                    loginVM.account.value = "";
                    loginVM.password.value = "";
                    clearInterval(loginVM.loadingAnimate);
                    loginVM.toastText = "登陆失败";
                    loginVM.toastMsg = true;
                    setTimeout(function () {
                        loginVM.toastMsg = false
                    }, 2000);
                }
            }).catch(err => {
                clearInterval(loginVM.loadingAnimate);
                loginVM.toastText = "系统出错";
                loginVM.toastMsg = true;
                setTimeout(function () {
                    loginVM.toastMsg = false
                }, 2000);
            })
        }
    }
});