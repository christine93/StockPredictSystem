<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8" />
		<title>Stock Prediction System</title>
		<link href="assets/css/bootstrap.min.css" rel="stylesheet">
		<link rel="stylesheet" href="assets/css/font-awesome.min.css">
		
		<link rel="stylesheet" href="assets/css/jquery.gritter.css" />
		
		<link rel="stylesheet" href="assets/css/ace.min.css" />
		<link rel="stylesheet" href="assets/css/ace-rtl.min.css" />
		<link rel="stylesheet" href="assets/css/ace-skins.min.css" />		
		<!-- page specific plugin styles -->
		<!-- jqgrid -->
		<link rel="stylesheet" href="assets/css/jquery-ui-1.10.3.full.min.css">
		<link rel="stylesheet" href="assets/css/datepicker.css" />
		<link rel="stylesheet" href="assets/css/ui.jqgrid.css" />

		<!--<link rel="stylesheet" href="assets/css/mySplitter.css">-->
		
		<link rel="stylesheet" href="assets/css/jquery-ui-1.10.3.custom.min.css" />
		<link rel="stylesheet" href="assets/css/search.css" />
	</head>

	<body>
		<div class="navbar navbar-default" id="navbar">
			<script type="text/javascript">
				try{ace.settings.check('navbar' , 'fixed')}catch(e){}
			</script>

			<div class="navbar-container" id="navbar-container">
				<div class="navbar-header pull-left">
					<a href="#" class="navbar-brand">
						<small>
							<i class="icon-leaf"></i>
							Stock Prediction System
						</small>
					</a><!-- /.brand -->
				</div><!-- /.navbar-header -->

				<div class="navbar-header pull-right" role="navigation">
					<ul class="nav ace-nav">
                    <!--
                    <li class="light-blue">
							<a data-toggle="dropdown" href="#" class="dropdown-toggle">
								<img class="nav-user-photo" src="assets/avatars/user.jpg" alt="Jason's Photo" />
								<span class="user-info">
									<small>Welcome,</small>
									Jason
								</span>

								<i class="icon-caret-down"></i>
							</a>

							<ul class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
								<li>
									<a href="#">
										<i class="icon-cog"></i>
										Settings
									</a>
								</li>

								<li>
									<a href="#">
										<i class="icon-user"></i>
										Profile
									</a>
								</li>

								<li class="divider"></li>

								<li>
									<a href="#">
										<i class="icon-off"></i>
										Logout
									</a>
								</li>
							</ul>
						</li>
                     -->
					<li class="light-blue">
                    <a href="aboutus">About Us</a>
                    </li>
					</ul><!-- /.ace-nav -->
				</div><!-- /.navbar-header -->
			</div><!-- /.container -->
		</div>

		<div class="main-container" id="main-container">
			<script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
			</script>

			<div class="main-container-inner">
				<a class="menu-toggler" id="menu-toggler" href="#">
					<span class="menu-text"></span>
				</a>

				<div class="sidebar" id="sidebar">
					<script type="text/javascript">
						try{ace.settings.check('sidebar' , 'fixed')}catch(e){}
					</script>

					<div class="sidebar-shortcuts" id="sidebar-shortcuts">
						<div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
							<button class="btn btn-success">
								<i class="icon-signal"></i>
							</button>

							<button class="btn btn-info">
								<i class="icon-pencil"></i>
							</button>

							<button class="btn btn-warning">
								<i class="icon-group"></i>
							</button>

							<button class="btn btn-danger">
								<i class="icon-cogs"></i>
							</button>
						</div>

						<div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
							<span class="btn btn-success"></span>

							<span class="btn btn-info"></span>

							<span class="btn btn-warning"></span>

							<span class="btn btn-danger"></span>
						</div>
					</div><!-- #sidebar-shortcuts -->

					<ul class="nav nav-list">
						<li id="mainpage" class="active">
							<a id="home" href="#">
								<i class="icon-dashboard"></i>
								<span class="menu-text"> Home </span>
							</a>
						</li>
						 
						<li id="google" onclick="hideContent('GOOG')" >
							<a href='#'>
								<i class="icon-dashboard"></i>
								<span class="menu-text"> Google </span>
							</a>
						</li>
						<li id="microsoft" onclick="hideContent('MSFT')">
							<a href="#">
								<i class="icon-dashboard"></i>
								<span class="menu-text"> Microsoft </span>
							</a>
						</li>
						<li id="amazon" onclick="hideContent('AMZN')">
							<a href="#">
								<i class="icon-dashboard"></i>
								<span class="menu-text"> Amazon </span>
							</a>
						</li>
						<li id="oracle" onclick="hideContent('ORCL')">
							<a href="#">
								<i class="icon-dashboard"></i>
								<span class="menu-text"> Oracle </span>
							</a>
						</li>
						<li id="yahoo" onclick="hideContent('YHOO')">
							<a href="#">
								<i class="icon-dashboard"></i>
								<span class="menu-text"> Yahoo </span>
							</a>
						</li>
						<li id="linkedin" onclick="hideContent('LNKD')">
							<a href="#">
								<i class="icon-dashboard"></i>
								<span class="menu-text"> LinkedIn </span>
							</a>
						</li>
						<li id="fb" onclick="hideContent('FB')">
							<a href="#">
								<i class="icon-dashboard"></i>
								<span class="menu-text"> Facebook </span>
							</a>
						</li>
						<li id="intel" onclick="hideContent('INTC')">
							<a href="#">
								<i class="icon-dashboard"></i>
								<span class="menu-text"> Intel </span>
							</a>
						</li>
						<li id="cisco" onclick="hideContent('CSCO')">
							<a href="#">
								<i class="icon-dashboard"></i>
								<span class="menu-text"> Cisco </span>
							</a>
						</li>
						<li id="apple" onclick="hideContent('AAPL')">
							<a href="#">
								<i class="icon-dashboard"></i>
								<span class="menu-text"> Apple </span>
							</a>
						</li>
					

					</ul><!-- /.nav-list -->

					<div class="sidebar-collapse" id="sidebar-collapse">
						<i class="icon-double-angle-left" data-icon1="icon-double-angle-left" data-icon2="icon-double-angle-right"></i>
					</div>

					<script type="text/javascript">
						try{ace.settings.check('sidebar' , 'collapsed')}catch(e){}
					</script>
				</div>

				<div class="main-content">
					<div class="breadcrumbs" id="breadcrumbs">
						<script type="text/javascript">
							try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
						</script>

						<ul id="process" class="breadcrumb">
							<li>
								<i class="icon-home home-icon"></i>
								<a href="#">Home</a>
							</li>

						</ul><!-- .breadcrumb -->

					</div>
					<div id="stock" style="display:none;">
						<div id="container4" style="height: 100%; width: 100%"></div>
						<div>The highest stock price of <span id="stockName"></span> in the last ten days:<span id="highest"></span></div>
						<div>Average stock price of <span id="stockName1"></span> in the latest one year:<span id="avg"></span></div>
						<div>Lowest stock price for <span id="stockName2"></span> in the latest one year:<span id="lowest"></span></div>
						
						<div>predict value:</div>
					</div>

					<div id="main" class="page-content">
						<!-- <div class="search"  style="margin-left:380px;">
                            <span class="s_con"><input id="stockname" type="text" class="content" placeholder="Search"><i class="clear"></i>
                            </span>
                            <span class="s_btn" id="search_button" onclick='hideContent()'>Search</span> 
                       	</div> -->

                        <div class="row" style="margin-top:110px"> 
                        <div class="col-xs-6">
                        <div id="container" style="height: 400px; min-width: 310px">

                        </div>
                        </div>
                        <div class="col-xs-6">
                        <div id="container1" style="height: 400px; min-width: 310px"></div>
                        </div>
                        
                        </div>
                        <div>The companies who have the average stock price lesser than the lowest of Google in the latest one year</div>          
                            
					</div><!-- /.page-content -->
				</div><!-- /.main-content -->

			</div><!-- /.main-container-inner -->

			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="icon-double-angle-up icon-only bigger-110"></i>
			</a>
		</div><!-- /.main-container -->

		
		<script type="text/javascript">
			window.jQuery || document.write("<script src='assets/js/jquery-2.0.3.min.js'>"+"<"+"/script>");
		</script>


		<script type="text/javascript">
			if("ontouchend" in document) document.write("<script src='assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
		</script>
		<script src="assets/js/bootstrap.min.js"></script>
		<script src="assets/js/typeahead-bs2.min.js"></script>

		<!-- page specific plugin scripts -->

		<!-- ace scripts -->

		<script src="assets/js/ace-elements.min.js"></script>
		<script src="assets/js/ace.min.js"></script>
		
        <script src="https://code.highcharts.com/stock/highstock.js"></script>
		<script src="https://code.highcharts.com/stock/modules/exporting.js"></script>
		<!-- inline scripts related to this page -->
		<script type="text/javascript">
		
		function hideContent(){
			var name = $("#stockname").val();

			var content =document.getElementById("main");
			content.style.display='none';
			var stock =  document.getElementById("stock");
			stock.style.display='block';
			
		}
		
		function hideContent(name){
			//alert(name);
			$( "#stockName" ).text( name );
			$( "#stockName1" ).text( name );
			$( "#stockName2" ).text( name );
		    var url = "http://localhost:8080/Ru250/searchhstock?name="+name;
			
		    $.getJSON(url, 				function (data) {
		    	
			    // Create the chart
			    $('#container4').highcharts('StockChart', {


			        rangeSelector : {
			            selected : 1
			        },

			        title : {
			            text : ' Stock Price'
			        },

			        series : [{
			            name : 'APPLE',
			            data : data,
			            tooltip: {
			                valueDecimals: 2
			            }
			        }]
			    });
			});
			var content =document.getElementById("main");
			content.style.display='none';
			var stock =  document.getElementById("stock");
			stock.style.display='block';
			
			/*Highest value*/
			var url1 = "http://localhost:8080/Ru250/highest?name="+name;
			$.ajax({
				type : "GET", 
				url:url1,
			    dataType:"json",
			    contentType:'application/json;charset=UTF-8',
			    success : function(data) {
			    	$( "#highest" ).text( data );
			        }
			    
			   });
			/*Average stock price in the latest one year*/
			var url2 = "http://localhost:8080/Ru250/avgstock?name="+name;
			$.ajax({
				type : "GET", 
				url:url2,
			    dataType:"json",
			    contentType:'application/json;charset=UTF-8',
			    success : function(data) {
			    	$( "#avg" ).text( data );
			        }
			    
			   });
			
			/*Lowest stock price in the latest one year*/
			var url3 = "http://localhost:8080/Ru250/lowest?name="+name;
			$.ajax({
				type : "GET", 
				url:url3,
			    dataType:"json",
			    contentType:'application/json;charset=UTF-8',
			    success : function(data) {
			    	$( "#lowest" ).text( data );
			        }
			    
			   });
		}
		
		function del(n){
				var s=document.getElementById('process');
				var t=s.childNodes.length;
				for (var i=0;i<t;i++){
					if (i==n-1){
						s.removeChild(s.childNodes[i]);
	   				}
				}
		}
				
		function clearAndSetBread(el){
		
				// clear all breadcrumb first
				del(3);
				
				// set breadcrumb
				var s = document.getElementById('process');
				var t = s.childNodes.length;
				var li = document.createElement("li");
				li.innerHTML = el;
				s.appendChild(li); 
		}
		
		
		function clearAndSetActiveStates(el) {
		
				// clear all active states first
				$('#mainpage').removeClass("active");				
				// set active state
				el.parent().addClass("active");		
		}
		
		jQuery(function($) {
			$("#home").on('click',function(){
						
						/*breadcrumbs*/
						//clearAndSetBread("Home");
						/*active*/
						clearAndSetActiveStates($(this));
						location.reload();
						
						
			});

		});
		
$(function () {
		$.getJSON('http://localhost:8080/Ru250/searchstock?name=GOOG', 				function (data) {
        // Create the chart
        $('#container').highcharts('StockChart', {


            rangeSelector : {
                selected : 1
            },

            title : {
                text : 'Google Stock Price'
            },

            series : [{
                name : 'GOOG',
                data : data,
                tooltip: {
                    valueDecimals: 2
                }
            }]
        });
    });

});
$(function () {
		$.getJSON('http://localhost:8080/Ru250/searchstock?name=MSFT', 				function (data) {
        // Create the chart
        $('#container1').highcharts('StockChart', {


            rangeSelector : {
                selected : 1
            },

            title : {
                text : 'Microsoft Stock Price'
            },

            series : [{
                name : 'MSFT',
                data : data,
                tooltip: {
                    valueDecimals: 2
                }
            }]
        });
    });

});


        </script>
</body>
</html>
