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
                    <a href="login_admin">log in</a>
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
						<!--
						<li id="search">
							<a id="search_stock" href="#">
								<i class="icon-text-width"></i>
								<span class="menu-text"> Search </span>
							</a>
						</li>

						
						<li id="faviorate">
							<a id="faviorate_stock" href="#" class="dropdown-toggle">
								<i class="icon-desktop"></i>
								<span class="menu-text"> My Faviorate </span>

								<b class="arrow icon-angle-down"></b>
							</a>

							<ul class="submenu">
								<li>
									<a href="#">
										<i class="icon-double-angle-right"></i>
										Stock 1
									</a>
								</li>

								<li>
									<a href="#">
										<i class="icon-double-angle-right"></i>
										Stock 2
									</a>
								</li>

								<li>
									<a href="#">
										<i class="icon-double-angle-right"></i>
										Stock 3
									</a>
								</li>

							</ul>
						</li>
						
						<li id="news">
							<a id="news_view" href="#">
								<i class="icon-dashboard"></i>
								<span class="menu-text"> News </span>
							</a>
						</li>

						<li id="profile">
							<a id="profile_modify" href="#">
								<i class="icon-dashboard"></i>
								<span class="menu-text"> My Profile </span>
							</a>
						</li>
  -->                      
                        <li id="about" >
							<a id="about_us" href="#">
								<i class="icon-dashboard"></i>
								<span class="menu-text"> About Us </span>
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

					<div id="main" class="page-content">
                    	<div class="row">
                        	<div class="search"  style="margin-left:380px;">
                            <span class="s_con"><input type="text" class="content" placeholder="Search"><i class="clear"></i>
                            </span>
                            <span class="s_btn" id="search_button">Search</span> 
                            </div>
                        </div>
						<div class="row" style="margin-top:10px;margin-left:170px;width:75%">
                            <div class="col-xs-6">
                            <label>
                                <input name="form-field-checkbox" type="checkbox" class="ace">							                            <span class="lbl"> search by stock name</span>
                            </label>
                            </div>
                            <div class="col-xs-6">
                            <label>
                                <input name="form-field-checkbox" type="checkbox" class="ace">
                                <span class="lbl"> search by stock number</span>
                            </label>
                            </div>
                        </div>  
                        <div class="row">
                        <div class="col-xs-3">
                        <div id="container" style="height: 400px; min-width: 310px"></div>
                        </div>
                        <div class="col-xs-3">
                        <div id="container1" style="height: 400px; min-width: 310px"></div>
                        </div>
                        <div class="col-xs-3">
                        <div id="container2" style="height: 400px; min-width: 310px"></div>
                        </div>
                        <div class="col-xs-3">
                        <div id="container3" style="height: 400px; min-width: 310px"></div>
                        </div>
                        </div>          
                            
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
				$('#search').removeClass("active");
				$('#news').removeClass("active");
				$('#faviorate').removeClass("active");
				$('#profile').removeClass("active");
				$('#about').removeClass("active");
				
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
			
			
			$("#faviorate_stock").on('click',function(){
						
						/*breadcrumbs*/
						clearAndSetBread("My Faviorate");
						/*active*/
						clearAndSetActiveStates($(this));
						//$("#main").load("upload.jsp");
						
			});
			$("#news_view").on('click',function(){
						
						/*breadcrumbs*/
						clearAndSetBread("News");
						/*active*/
						clearAndSetActiveStates($(this));
						//$("#main").load("upload.jsp");
						
			});
			$("#profile_modify").on('click',function(){
						
						/*breadcrumbs*/
						clearAndSetBread("My Profile");
						/*active*/
						clearAndSetActiveStates($(this));
						//$("#main").load("upload.jsp");
						
			});
			$("#about_us").on('click',function(){
						
						/*breadcrumbs*/
						clearAndSetBread("About Us");
						/*active*/
						clearAndSetActiveStates($(this));
						//$("#main").load("upload.jsp");
						document.getElementById("main").innerHTML='<iframe src="aboutus.html" width="100%" height="600" scrolling="yes" />';
						
			});
			
			$("#search_button").on('click', function(){
				document.getElementById("main").innerHTML='<iframe src="highchart.html" width="100%" height="600" scrolling="yes" />';
	
			});
		});
		
$(function () {
		$.getJSON('https://www.highcharts.com/samples/data/jsonp.php?filename=aapl-c.json&callback=?', 				function (data) {
        // Create the chart
        $('#container').highcharts('StockChart', {


            rangeSelector : {
                selected : 1
            },

            title : {
                text : 'AAPL Stock Price'
            },

            series : [{
                name : 'AAPL',
                data : data,
                tooltip: {
                    valueDecimals: 2
                }
            }]
        });
    });

});
$(function () {
		$.getJSON('https://www.highcharts.com/samples/data/jsonp.php?filename=aapl-c.json&callback=?', 				function (data) {
        // Create the chart
        $('#container1').highcharts('StockChart', {


            rangeSelector : {
                selected : 1
            },

            title : {
                text : 'GOOGLE Stock Price'
            },

            series : [{
                name : 'GOOGLE',
                data : data,
                tooltip: {
                    valueDecimals: 2
                }
            }]
        });
    });

});
$(function () {
		$.getJSON('https://www.highcharts.com/samples/data/jsonp.php?filename=aapl-c.json&callback=?', 				function (data) {
        // Create the chart
        $('#container2').highcharts('StockChart', {


            rangeSelector : {
                selected : 1
            },

            title : {
                text : 'APPLE Stock Price'
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

});
$(function () {
		$.getJSON('https://www.highcharts.com/samples/data/jsonp.php?filename=aapl-c.json&callback=?', 				function (data) {
        // Create the chart
        $('#container3').highcharts('StockChart', {


            rangeSelector : {
                selected : 1
            },

            title : {
                text : 'TWITTER Stock Price'
            },

            series : [{
                name : 'TWITTER',
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
