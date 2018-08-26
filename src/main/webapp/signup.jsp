<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" class="app">
<head>  
  <meta charset="utf-8" />
  <title>Musik | Web Application</title>
  <style type="text/css">

p{margin:0;padding:0;}

</style>
   
  <script type="text/javascript" src="js/jquery.min.js">  
  </script>
  <script type="text/javascript">
  function sendCode(){
  var email={email: $("#email").val()};
  
  if($("#email").val()=="" || $("#email").val()==null){
	  alert("邮箱不能为空！");
  }else{
	  alert("邮箱已发送");
  $.post("sendCode",email,function(email){
	 
  });
  }
 	}
  
   function selectUser(){
	  
	  var name={name: $("#name").val()};
	  $.post("selectUser",name,function(name){
		 
	  });

  }
  
  function showmsg() {
		  if($("#name").val()=="" || $("#name").val()==null){
		  $("#msgname").text("请输入用户名");
	  }else{
		  $("#msgname").text("");

	  }/* else{
		  $("#name").mouseout(function(){
			  $("#msgname").text("");
			  var name={name: $("#name").val()};
			  if($("#name").val()!="" || $("#name").val()!=null){
				  $.post("selectName",name,function(name){
					  
				  });
				  
			  }
			
		  });
	  } */
			
} 
  	function pwdmsg(){
  	  if($("#pwd").val()=="" || $("#pwd").val()==null){
  		  $("#msgpwd").text("请输入密码");
  	  }else{
		  $("#msgpwd").text("");
		  
		/*   $("#msgpwd").mouseout(function(){
			  if($("#pwd").val()!="" || $("#pwd").val()!=null){
		  		  $("#msgname").text("");
			  }
			  
			  
		  });
		   */
		  }
	  
  	}
  	
  	function emailmsg(){
    	  if($("#email").val()=="" || $("#email").val()==null){
    		  $("#msgemail").text("请输入邮箱");
    	  }else{
  		  $("#msgemail").text("");
  		  
  		/*   $("#msgpwd").mouseout(function(){
  			  if($("#pwd").val()!="" || $("#pwd").val()!=null){
  		  		  $("#msgname").text("");
  			  }
  			  
  			  
  		  });
  		   */
  		  }
  	  
    	   
    		
    		
    	}
/*   $(document).ready(function(){
	  
	  
	  
	  
	  
	  
	  
	 
	  $("#name").mouseout(function(){
		  var name={name: $("#name").val()};
		  if($("#name").val()!="" || $("#name").val()!=null){
			  $.post("selectName",name,function(name){
				  
			  });
			  
		  }
		
	  }); 
	});  
   */
  </script>
  <meta name="description" content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav" />
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
  <link rel="stylesheet" href="js/jPlayer/jplayer.flat.css" type="text/css" />
  <link rel="stylesheet" href="css/bootstrap.css" type="text/css" />
  <link rel="stylesheet" href="css/animate.css" type="text/css" />
  <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css" />
  <link rel="stylesheet" href="css/simple-line-icons.css" type="text/css" />
  <link rel="stylesheet" href="css/font.css" type="text/css" />
  <link rel="stylesheet" href="css/app.css" type="text/css" />  
    <!--[if lt IE 9]>
    <script src="js/ie/html5shiv.js"></script>
    <script src="js/ie/respond.min.js"></script>
    <script src="js/ie/excanvas.js"></script>
  <![endif]-->
</head>
<body class="bg-info dker">
  <section id="content" class="m-t-lg wrapper-md animated fadeInDown">
    <div class="container aside-xl">
      <a class="navbar-brand block" href="index.html"><span class="h1 font-bold">Musik</span></a>
      <section class="m-b-lg">
        <header class="wrapper text-center">
          <strong>Sign up to find interesting thing</strong>
        </header>
        
        <b  style=" color: red; margin-left: 1px ; padding-left:90px" >${msg}</b>
        
         
        <form action="signup.do">
          <div class="form-group">
            <input onclick="showmsg()" name="user_name" id="name" placeholder="用户名" class="form-control rounded input-lg text-center no-border" >
          <b  id="msgname"  style=" color: red; margin-left: 1px ; padding-left:30px" >${msgname}</b>
        
          </div>
          
    
          <div class="form-group" >
             
            <input id="pwd" onclick="pwdmsg()" name="user_pwd" type="password" placeholder="密码" class="form-control rounded input-lg text-center no-border">
          <b  id="msgpwd"  style=" color: red; margin-left: 1px ; padding-left:30px" >${msgpwd}</b>
          </div>
           <div class="form-group">
            <input onclick="emailmsg()" name="user_email" id="email" type="email" placeholder="邮箱" class="form-control rounded input-lg text-center no-border">
          <b  id="msgemail"  style=" color: red; margin-left: 1px ; padding-left:30px" >${msgemail}</b>
          </div>
            
             <header class="wrapper text-center">
         <a href="#" onclick="sendCode()" > <strong >点击获取验证码</strong> </a>
        </header>
          <div class="form-group">
             <input  name="code" type="text" placeholder="验证码" class="form-control rounded input-lg text-center no-border">
          </div>
            <b style="color: red; margin-left: 115px" ></b>   
          <div class="checkbox i-checks m-b">
            <label class="m-l">
              <input type="checkbox" checked=""><i></i> Agree the <a href="#">terms and policy</a>
            </label>
          </div>
          <button  type="submit" class="btn btn-lg btn-warning lt b-white b-2x btn-block btn-rounded"><i class="icon-arrow-right pull-right"></i><span class="m-r-n-lg">注册</span></button>
          <div class="line line-dashed"></div>
          <p class="text-muted text-center"><small>Already have an account?</small></p>
          <a href="signin.html" class="btn btn-lg btn-info btn-block btn-rounded">登录</a>
        </form>
        
        
      </section>
    </div>
  </section>
  <!-- footer -->
  <footer id="footer">
    <div class="text-center padder clearfix">
      <p>
        <small>Web app framework base on Bootstrap<br>&copy; 2014</small>
      </p>
    </div>
  </footer>
  <!-- / footer -->
  <script src="js/jquery.min.js"></script>
  <!-- Bootstrap -->
  <script src="js/bootstrap.js"></script>
  <!-- App -->
  <script src="js/app.js"></script>  
  <script src="js/slimscroll/jquery.slimscroll.min.js"></script>
    <script src="js/app.plugin.js"></script>
  <script type="text/javascript" src="js/jPlayer/jquery.jplayer.min.js"></script>
  <script type="text/javascript" src="js/jPlayer/add-on/jplayer.playlist.min.js"></script>
  <script type="text/javascript" src="js/jPlayer/demo.js"></script>

</body>
</html>