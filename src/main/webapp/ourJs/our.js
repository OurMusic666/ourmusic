var script=document.createElement("script"); 
script.type="text/javascript"; 
script.src="js/jquery.min.js"; 
document.getElementsByTagName('head')[0].appendChild(script);  


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
  
  function showmsg(data) {
		  if($("#name").val()=="" || $("#name").val()==null){
		  $("#msgname").text("请输入用户名");
		  
		  $("#name").mouseout(function(){
			  $("#msgname").text("");
			  var name={name: $("#name").val()};
			  
			  if($("#name").val()!="" || $("#name").val()!=null){
				  $.post("selectName",name,function(flag){
					  if(flag==1){
						  $("#msgname").text("用户名已被注册");
					  }else if(flag==3){
						  $("#msgname").text("用户名不为空");
					  }else{
						  $("#msgname").text("");
					  }
					
					
				  });
				  
				
	
		
	
				  
			  }
			
		  });
		  
	  }else{
		  /* $("#msgname").text(""); */

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