

$(function(){

    /*$.ajax({
        type : "POST",            // HTTP method type(GET, POST) 형식이다.
        url : "/test/ajax",      // 컨트롤러에서 대기중인 URL 주소이다.
        data : params,            // Json 형식의 데이터이다.
        success : function(res){ // 비동기통신의 성공일경우 success콜백으로 들어옵니다. 'res'는 응답받은 데이터이다.
            // 응답코드 > 0000
            alert(res.code);
        },
        error : function(XMLHttpRequest, textStatus, errorThrown){ // 비동기 통신이 실패할경우 error 콜백으로 들어옵니다.
            alert("통신 실패.")
        }
    });*/

});

function signUpFriend(){

    console.log("--------------회원가입")
    let fEmail = $("#signUpFEmail").val();
    let fName = $("#signUpFName").val();

    let fPhone = $("#signUpFPhone").val();

    let fPassWordChk = $("#signUpFPasswordChk").val();
    let fPassword = $("#signUpFPassword").val();

    if(fPassword != fPassWordChk){
        alert("패스워드가 동일 해야합니다.");
        return false;
    }

    let selectedValue = $("input[name='signUpFJob']:checked").val();

    let fJob = selectedValue;

    const data = {
        fEmail : fEmail ,
        fName : fName ,
        fPassword : fPassword ,
        fPhone : fPhone ,
        fJob : fJob
    }
    console.log("------------------------가입 data 확인" + data.fEmail);

    $.ajax({

        type : "POST",            // HTTP method type(GET, POST) 형식이다.
        url : "/signUpFriend",      // 컨트롤러에서 대기중인 URL 주소이다.
        data : data,            // Json 형식의 데이터이다.
        success : function(data){ // 비동기통신의 성공일경우 success콜백으로 들어옵니다. 'res'는 응답받은 데이터이다.
            console.log(data);
            },
        error : function(XMLHttpRequest, textStatus, errorThrown){ // 비동기 통신이 실패할경우 error 콜백으로 들어옵니다.
            alert("통신 실패.")
        }
    });

}

function logintry(){
    console.log("------------------------로그인 트라이")
    let lEMAIL = $("#loginFEmail").val();
    let lPASSWORD = $("#loginFPwd").val();
    // const loginFrame = document.querySelector("#modalContainer");
    // if (ffEmail !== "n"){
    //     console.log("------------------------아이디 불일치 ")
    //     alert("아이디가 일치하지 않습니다.");
    //     return false;
    // }

    // const data = {
    //     lEMAIL : lEMAIL ,
    //     lPASSWORD : lPASSWORD
    // }


    var param = {"id" : lEMAIL, "pw" : lPASSWORD};

    console.log("------------------------ 로그인 data 확인" + param);
    $.ajax({

        type : "POST",            // HTTP method type(GET, POST) 형식이다.
        url : "/loginFriend",      // 컨트롤러에서 대기중인 URL 주소이다.
        dataType : JSON,
        data : JSON.stringify(param),            // Json 형식의 데이터이다.
        contentType : 'application/json; charset=utf-8',
        success : function(data){ // 비동기통신의 성공일경우 success콜백으로 들어옵니다. 'res'는 응답받은 데이터이다.
            console.log(data);
            // $("#modalContainer").css("display", "none");
            // location.href='/'
        },
        error : function(XMLHttpRequest, textStatus, errorThrown){ // 비동기 통신이 실패할경우 error 콜백으로 들어옵니다.
            alert("통신 실패.")
        }
    });

}


// function loginFriend(){
//
//     let fEmail = $("#signUpFEmail").val();
//     let fPassword = $("#signUpFPassword").val();
//
//     if(fEmail.size == 1){
//         alert("패스워드가 동일 해야합니다.");
//         return false;
//     }
//
//     let selectedValue = $("input[name='signUpFJob']:checked").val();
//
//     let fJob = selectedValue;
//
//     const data = {
//         fEmail : fEmail ,
//         fName : fName ,
//         fPassword : fPassword ,
//         fPhone : fPhone ,
//         fJob : fJob
//     }
//
//     $.ajax({
//
//         type : "POST",            // HTTP method type(GET, POST) 형식이다.
//         url : "/signUpFriend",      // 컨트롤러에서 대기중인 URL 주소이다.
//         data : data,            // Json 형식의 데이터이다.
//         success : function(data){ // 비동기통신의 성공일경우 success콜백으로 들어옵니다. 'res'는 응답받은 데이터이다.
//             console.log(data);
//         },
//         error : function(XMLHttpRequest, textStatus, errorThrown){ // 비동기 통신이 실패할경우 error 콜백으로 들어옵니다.
//             alert("통신 실패.")
//         }
//     });
//
// }