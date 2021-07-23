<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>

  <!-- Basic Page Needs
  ================================================== -->
  <meta charset="UTF-8">
  <title>Aviato | E-commerce template</title>

  <!-- Mobile Specific Metas
  ================================================== -->
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="description" content="Construction Html5 Template">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=5.0">
  <meta name="author" content="Themefisher">
  <meta name="generator" content="Themefisher Constra HTML Template v1.0">
  
  <!-- Favicon -->
  <link rel="shortcut icon" type="image/x-icon" href="/resources/images/favicon.png" />
  
  <!-- Themefisher Icon font -->
  <link rel="stylesheet" href="/resources/plugins/themefisher-font/style.css">
  <!-- bootstrap.min css -->
  <link rel="stylesheet" href="/resources/plugins/bootstrap/css/bootstrap.min.css">
  
  <!-- Animate css -->
  <link rel="stylesheet" href="/resources/plugins/animate/animate.css">
  <!-- Slick Carousel -->
  <link rel="stylesheet" href="/resources/plugins/slick/slick.css">
  <link rel="stylesheet" href="/resources/plugins/slick/slick-theme.css">
  
  <!-- Main Stylesheet -->
  <link rel="stylesheet" href="/resources/css/style.css">

</head>

<body id="body">

<!-- Start Top Header Bar -->
<section class="top-header">
	<div class="container">
		<div class="row">
			<div class="col-md-4 col-xs-12 col-sm-4">
				<div class="contact-number">
					<i class="tf-ion-ios-telephone"></i>
					<span>0129- 12323-123123</span>
				</div>
			</div>
			<div class="col-md-4 col-xs-12 col-sm-4">
				<!-- Site Logo -->
				<div class="logo text-center">
					<a href="/">
						<!-- replace logo here -->
						<svg width="135px" height="29px" viewBox="0 0 155 29" version="1.1" xmlns="http://www.w3.org/2000/svg"
							xmlns:xlink="http://www.w3.org/1999/xlink">
							<g id="Page-1" stroke="none" stroke-width="1" fill="none" fill-rule="evenodd" font-size="40"
								font-family="AustinBold, Austin" font-weight="bold">
								<g id="Group" transform="translate(-108.000000, -297.000000)" fill="#000000">
									<text id="AVIATO">
										<tspan x="108.94" y="325">AVIATO</tspan>
									</text>
								</g>
							</g>
						</svg>
					</a>
				</div>
			</div>
			<div class="col-md-4 col-xs-12 col-sm-4">
				<!-- Cart -->
				<ul class="top-menu text-right list-inline">
					<li class="dropdown cart-nav dropdown-slide">
						<a href="#!" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown"><i
								class="tf-ion-android-cart"></i>Cart</a>
						<div class="dropdown-menu cart-dropdown">
							<!-- Cart Item -->
							<div class="media">
								<a class="pull-left" href="#!">
									<img class="media-object" src="images/shop/cart/cart-1.jpg" alt="image" />
								</a>
								<div class="media-body">
									<h4 class="media-heading"><a href="#!">Ladies Bag</a></h4>
									<div class="cart-price">
										<span>1 x</span>
										<span>1250.00</span>
									</div>
									<h5><strong>$1200</strong></h5>
								</div>
								<a href="#!" class="remove"><i class="tf-ion-close"></i></a>
							</div><!-- / Cart Item -->
							<!-- Cart Item -->
							<div class="media">
								<a class="pull-left" href="#!">
									<img class="media-object" src="images/shop/cart/cart-2.jpg" alt="image" />
								</a>
								<div class="media-body">
									<h4 class="media-heading"><a href="#!">Ladies Bag</a></h4>
									<div class="cart-price">
										<span>1 x</span>
										<span>1250.00</span>
									</div>
									<h5><strong>$1200</strong></h5>
								</div>
								<a href="#!" class="remove"><i class="tf-ion-close"></i></a>
							</div><!-- / Cart Item -->

							<div class="cart-summary">
								<span>Total</span>
								<span class="total-price">$1799.00</span>
							</div>
							<ul class="text-center cart-buttons">
								<li><a href="cart" class="btn btn-small">View Cart</a></li>
								<li><a href="checkout" class="btn btn-small btn-solid-border">Checkout</a></li>
							</ul>
						</div>

					</li><!-- / Cart -->

					<!-- Search -->
					<li class="dropdown search dropdown-slide">
						<a href="#!" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown"><i
								class="tf-ion-ios-search-strong"></i> Search</a>
						<ul class="dropdown-menu search-dropdown">
							<li>
								<form action="post"><input type="search" class="form-control" placeholder="Search..."></form>
							</li>
						</ul>
					</li><!-- / Search -->

					<!-- Languages -->
					<li class="commonSelect">
						<select class="form-control">
							<option>EN</option>
							<option>DE</option>
							<option>FR</option>
							<option>ES</option>
						</select>
					</li><!-- / Languages -->

				</ul><!-- / .nav .navbar-nav .navbar-right -->
			</div>
		</div>
	</div>
</section><!-- End Top Header Bar -->


<!-- Main Menu Section -->
<section class="menu">
	<nav class="navbar navigation">
		<div class="container">
			<div class="navbar-header">
				<h2 class="menu-title">Main Menu</h2>
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
					aria-expanded="false" aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>

			</div><!-- / .navbar-header -->

			<!-- Navbar Links -->
			<div id="navbar" class="navbar-collapse collapse text-center">
				<ul class="nav navbar-nav">

					<!-- Home -->
					<li class="dropdown ">
						<a href="/">Home</a>
					</li><!-- / Home -->


					<!-- Elements -->
					<li class="dropdown dropdown-slide">
						<a href="#!" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="350"
							role="button" aria-haspopup="true" aria-expanded="false">Shop <span
								class="tf-ion-ios-arrow-down"></span></a>
						<div class="dropdown-menu">
							<div class="row">

								<!-- Basic -->
								<div class="col-lg-6 col-md-6 mb-sm-3">
									<ul>
										<li class="dropdown-header">Pages</li>
										<li role="separator" class="divider"></li>
										<li><a href="shop">Shop</a></li>
										<li><a href="checkout">Checkout</a></li>
										<li><a href="cart">Cart</a></li>
										<li><a href="pricing">Pricing</a></li>
										<li><a href="confirmation">Confirmation</a></li>

									</ul>
								</div>

								<!-- Layout -->
								<div class="col-lg-6 col-md-6 mb-sm-3">
									<ul>
										<li class="dropdown-header">Layout</li>
										<li role="separator" class="divider"></li>
										<li><a href="product-single">Product Details</a></li>
										<li><a href="shop-sidebar">Shop With Sidebar</a></li>

									</ul>
								</div>

							</div><!-- / .row -->
						</div><!-- / .dropdown-menu -->
					</li><!-- / Elements -->


					<!-- Pages -->
					<li class="dropdown full-width dropdown-slide">
						<a href="#!" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="350"
							role="button" aria-haspopup="true" aria-expanded="false">Pages <span
								class="tf-ion-ios-arrow-down"></span></a>
						<div class="dropdown-menu">
							<div class="row">

								<!-- Introduction -->
								<div class="col-sm-3 col-xs-12">
									<ul>
										<li class="dropdown-header">Introduction</li>
										<li role="separator" class="divider"></li>
										<li><a href="contact">Contact Us</a></li>
										<li><a href="about">About Us</a></li>
										<li><a href="404">404 Page</a></li>
										<li><a href="coming-soon">Coming Soon</a></li>
										<li><a href="faq">FAQ</a></li>
									</ul>
								</div>

								<!-- Contact -->
								<div class="col-sm-3 col-xs-12">
									<ul>
										<li class="dropdown-header">Dashboard</li>
										<li role="separator" class="divider"></li>
										<li><a href="dashboard">User Interface</a></li>
										<li><a href="order">Orders</a></li>
										<li><a href="address">Address</a></li>
										<li><a href="profile-details">Profile Details</a></li>
									</ul>
								</div>

								<!-- Utility -->
								<div class="col-sm-3 col-xs-12">
									<ul>
										<li class="dropdown-header">Utility</li>
										<li role="separator" class="divider"></li>
										<li><a href="login">Login Page</a></li>
										<li><a href="signin">Signin Page</a></li>
										<li><a href="forget-password">Forget Password</a></li>
									</ul>
								</div>

								<!-- Mega Menu -->
								<div class="col-sm-3 col-xs-12">
									<a href="shop">
										<img class="img-responsive" src="images/shop/header-img.jpg" alt="menu image" />
									</a>
								</div>
							</div><!-- / .row -->
						</div><!-- / .dropdown-menu -->
					</li><!-- / Pages -->



					<!-- Blog -->
					<li class="dropdown dropdown-slide">
						<a href="#!" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="350"
							role="button" aria-haspopup="true" aria-expanded="false">Blog <span
								class="tf-ion-ios-arrow-down"></span></a>
						<ul class="dropdown-menu">
							<li><a href="blog-left-sidebar">Blog Left Sidebar</a></li>
							<li><a href="blog-right-sidebar">Blog Right Sidebar</a></li>
							<li><a href="blog-full-width">Blog Full Width</a></li>
							<li><a href="blog-grid">Blog 2 Columns</a></li>
							<li><a href="blog-single">Blog Single</a></li>
						</ul>
					</li><!-- / Blog -->

					<!-- Shop -->
					<li class="dropdown dropdown-slide">
						<a href="#!" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="350"
							role="button" aria-haspopup="true" aria-expanded="false">Elements <span
								class="tf-ion-ios-arrow-down"></span></a>
						<ul class="dropdown-menu">
							<li><a href="typography">Typography</a></li>
							<li><a href="buttons">Buttons</a></li>
							<li><a href="alerts">Alerts</a></li>
						</ul>
					</li><!-- / Blog -->
				</ul><!-- / .nav .navbar-nav -->

			</div>
			<!--/.navbar-collapse -->
		</div><!-- / .container -->
	</nav>
</section>

<section class="page-header">
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="content">
					<h1 class="page-name">Blog</h1>
					<ol class="breadcrumb">
						<li><a href="/">Home</a></li>
						<li class="active">blog</li>
					</ol>
				</div>
			</div>
		</div>
	</div>
</section>

<div class="page-wrapper">
	<div class="container">
		<div class="row">
      		<div class="col-md-4">
				<aside class="sidebar">
	<div class="widget widget-subscription">
		<h4 class="widget-title">Get notified updates</h4>
		<form>
		  <div class="form-group">
		    <input type="email" class="form-control" placeholder="Your Email Address">
		  </div>
		  <button type="submit" class="btn btn-main">I am in</button>
		</form>
	</div>

	<!-- Widget Latest Posts -->
	<div class="widget widget-latest-post">
		<h4 class="widget-title">Latest Posts</h4>
		<div class="media">
			<a class="pull-left" href="#!">
				<img class="media-object" src="images/blog/post-thumb.jpg" alt="Image">
			</a>
			<div class="media-body">
				<h4 class="media-heading"><a href="#!">Introducing Swift for Mac</a></h4>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quis, officia.</p>
			</div>
		</div>
		<div class="media">
			<a class="pull-left" href="#!">
				<img class="media-object" src="images/blog/post-thumb-2.jpg" alt="Image">
			</a>
			<div class="media-body">
				<h4 class="media-heading"><a href="#!">Welcome to Themefisher Family</a></h4>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quis, officia.</p>
			</div>
		</div>
		<div class="media">
			<a class="pull-left" href="#!">
				<img class="media-object" src="images/blog/post-thumb-3.jpg" alt="Image">
			</a>
			<div class="media-body">
				<h4 class="media-heading"><a href="#!">Warm welcome from swift</a></h4>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quis, officia.</p>
			</div>
		</div>
		<div class="media">
			<a class="pull-left" href="#!">
				<img class="media-object" src="images/blog/post-thumb.jpg" alt="Image">
			</a>
			<div class="media-body">
				<h4 class="media-heading"><a href="#!">Introducing Swift for Mac</a></h4>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quis, officia.</p>
			</div>
		</div>
	</div>
	<!-- End Latest Posts -->

	<!-- Widget Category -->
	<div class="widget widget-category">
		<h4 class="widget-title">Categories</h4>
		<ul class="widget-category-list">
	        <li><a href="#!">Animals</a>
	        </li>
	        <li><a href="#!">Landscape</a>
	        </li>
	        <li><a href="#!">Portrait</a>
	        </li>
	        <li><a href="#!">Wild Life</a>
	        </li>
	        <li><a href="#!">Video</a>
	        </li>
	    </ul>
	</div> <!-- End category  -->

	<!-- Widget tag -->
	<div class="widget widget-tag">
		<h4 class="widget-title">Tag Cloud</h4>
		<ul class="widget-tag-list">
	        <li><a href="#!">Animals</a>
	        </li>
	        <li><a href="#!">Landscape</a>
	        </li>
	        <li><a href="#!">Portrait</a>
	        </li>
	        <li><a href="#!">Wild Life</a>
	        </li>
	        <li><a href="#!">Video</a>
	        </li>
	    </ul>
	</div> <!-- End tag  -->

	





</aside>
      		</div>
			<div class="col-md-8">
        		<div class="post">
	<div class="post-media post-thumb">
		<a href="blog-single">
			<img src="images/blog/blog-post-1.jpg" alt="">
		</a>
	</div>
	<h2 class="post-title"><a href="blog-single">How To Wear Bright Shoes</a></h2>
	<div class="post-meta">
		<ul>
			<li>
				<i class="tf-ion-ios-calendar"></i> 20, MAR 2017
			</li>
			<li>
				<i class="tf-ion-android-person"></i> POSTED BY ADMIN
			</li>
			<li>
				<a href="#!"><i class="tf-ion-ios-pricetags"></i> LIFESTYLE</a>,<a href="#!"> TRAVEL</a>, <a href="#!">FASHION</a>
			</li>
			<li>
				<a href="#!"><i class="tf-ion-chatbubbles"></i> 4 COMMENTS</a>
			</li>
		</ul>
	</div>
	<div class="post-content">
		<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Velit vitae placeat ad architecto nostrum asperiores vel aperiam, veniam eum nulla. Maxime cum magnam, adipisci architecto quibusdam cumque veniam fugiat quae. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Odio vitae ab doloremque accusamus sit, eos dolorum officiis a perspiciatis aliquid. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quod, facere. </p>
		<a href="blog-single" class="btn btn-main">Continue Reading</a>
	</div>

</div>
<div class="post">
	<div class="post-media post-thumb">
		<a href="blog-single">
			<img src="images/blog/blog-post-2.jpg" alt="">
		</a>
	</div>
	<h2 class="post-title"><a href="blog-single">Two Ways To Wear Straight Shoes</a></h2>
	<div class="post-meta">
		<ul>
			<li>
				<i class="tf-ion-ios-calendar"></i> 20, MAR 2017
			</li>
			<li>
				<i class="tf-ion-android-person"></i> POSTED BY ADMIN
			</li>
			<li>
				<a href="#!"><i class="tf-ion-ios-pricetags"></i> LIFESTYLE</a>,<a href="#!"> TRAVEL</a>, <a href="#!">FASHION</a>
			</li>
			<li>
				<a href="#!"><i class="tf-ion-chatbubbles"></i> 4 COMMENTS</a>
			</li>
		</ul>
	</div>
	<div class="post-content">
		<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Velit vitae placeat ad architecto nostrum asperiores vel aperiam, veniam eum nulla. Maxime cum magnam, adipisci architecto quibusdam cumque veniam fugiat quae. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Odio vitae ab doloremque accusamus sit, eos dolorum officiis a perspiciatis aliquid. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quod, facere</p>
		<a href="blog-single" class="btn btn-main">Continue Reading</a>
	</div>
</div>
<div class="post">
	<div class="post-media post-thumb">
		<a href="blog-single">
			<img src="images/blog/blog-post-3.jpg" alt="">
		</a>
	</div>
	<h2 class="post-title"><a href="blog-single">Making A Denim Statement</a></h2>
	<div class="post-meta">
		<ul>
			<li>
				<i class="tf-ion-ios-calendar"></i> 20, MAR 2017
			</li>
			<li>
				<i class="tf-ion-android-person"></i> POSTED BY ADMIN
			</li>
			<li>
				<a href="#!"><i class="tf-ion-ios-pricetags"></i> LIFESTYLE</a>,<a href="#!"> TRAVEL</a>, <a href="#!">FASHION</a>
			</li>
			<li>
				<a href="#!"><i class="tf-ion-chatbubbles"></i> 4 COMMENTS</a>
			</li>
		</ul>
	</div>
	<div class="post-content">
		<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Velit vitae placeat ad architecto nostrum asperiores vel aperiam, veniam eum nulla. Maxime cum magnam, adipisci architecto quibusdam cumque veniam fugiat quae. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Odio vitae ab doloremque accusamus sit, eos dolorum officiis a perspiciatis aliquid. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quod, facere</p>
		<a href="blog-single" class="btn btn-main">Continue Reading</a>
	</div>
</div>

<div class="post">
	<h2 class="post-title"><a href="blog-single">Standard Text Post</a></h2>
	<div class="post-meta">
		<ul>
			<li>
				<i class="tf-ion-ios-calendar"></i> 20, MAR 2017
			</li>
			<li>
				<i class="tf-ion-android-person"></i> POSTED BY ADMIN
			</li>
			<li>
				<a href="#!"><i class="tf-ion-ios-pricetags"></i> LIFESTYLE</a>,<a href="#!"> TRAVEL</a>, <a href="#!">FASHION</a>
			</li>
			<li>
				<a href="#!"><i class="tf-ion-chatbubbles"></i> 4 COMMENTS</a>
			</li>
		</ul>
	</div>
	<div class="post-content">
		<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Velit vitae placeat ad architecto nostrum asperiores vel aperiam, veniam eum nulla. Maxime cum magnam, adipisci architecto quibusdam cumque veniam fugiat quae. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Odio vitae ab doloremque accusamus sit, eos dolorum officiis a perspiciatis aliquid. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quod, facere</p>
		<a href="blog-single" class="btn btn-main">Continue Reading</a>
	</div>
</div>
<div class="post">
	<div class="post-media post-media-audio">
		<iframe src="https://w.soundcloud.com/player/?url=https%3A//api.soundcloud.com/tracks/115637399&amp;color=ff5500&amp;auto_play=false&amp;show_artwork=true" class="DRAGDIS_iframe"></iframe>
	</div>
	<h2 class="post-title"><a href="blog-single">Standard Audio Post</a></h2>
	<div class="post-meta">
		<ul>
			<li>
				<i class="tf-ion-ios-calendar"></i> 20, MAR 2017
			</li>
			<li>
				<i class="tf-ion-android-person"></i> POSTED BY ADMIN
			</li>
			<li>
				<a href="#!"><i class="tf-ion-ios-pricetags"></i> LIFESTYLE</a>,<a href="#!"> TRAVEL</a>, <a href="#!">FASHION</a>
			</li>
			<li>
				<a href="#!"><i class="tf-ion-chatbubbles"></i> 4 COMMENTS</a>
			</li>
		</ul>
	</div>
	<div class="post-content">
		<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Velit vitae placeat ad architecto nostrum asperiores vel aperiam, veniam eum nulla. Maxime cum magnam, adipisci architecto quibusdam cumque veniam fugiat quae. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Odio vitae ab doloremque accusamus sit, eos dolorum officiis a perspiciatis aliquid. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quod, facere</p>
		<a href="blog-single" class="btn btn-main">Continue Reading</a>
	</div>
</div>
<div class="post">
	<div class="post-media post-media-audio">
		<iframe height="400" src="https://www.youtube.com/embed/Ljik3zsGNF4"  allowfullscreen></iframe>
	</div>
	<h2 class="post-title"><a href="blog-single">Standard Video Post</a></h2>
	<div class="post-meta">
		<ul>
			<li>
				<i class="tf-ion-ios-calendar"></i> 20, MAR 2017
			</li>
			<li>
				<i class="tf-ion-android-person"></i> POSTED BY ADMIN
			</li>
			<li>
				<a href="#!"><i class="tf-ion-ios-pricetags"></i> LIFESTYLE</a>,<a href="#!"> TRAVEL</a>, <a href="#!">FASHION</a>
			</li>
			<li>
				<a href="#!"><i class="tf-ion-chatbubbles"></i> 4 COMMENTS</a>
			</li>
		</ul>
	</div>
	<div class="post-content">
		<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Velit vitae placeat ad architecto nostrum asperiores vel aperiam, veniam eum nulla. Maxime cum magnam, adipisci architecto quibusdam cumque veniam fugiat quae. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Odio vitae ab doloremque accusamus sit, eos dolorum officiis a perspiciatis aliquid. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quod, facere</p>
		<a href="blog-single" class="btn btn-main">Continue Reading</a>
	</div>
</div>
<div class="text-center">
	<ul class="pagination post-pagination">
		<li><a href="#!">Prev</a>
		</li>
		<li class="active"><a href="#!">1</a>
		</li>
		<li><a href="#!">2</a>
		</li>
		<li><a href="#!">3</a>
		</li>
		<li><a href="#!">4</a>
		</li>
		<li><a href="#!">5</a>
		</li>
		<li><a href="#!">Next</a>
		</li>
	</ul>
</div>
      		</div>
		</div>
	</div>
</div>


<footer class="footer section text-center">
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<ul class="social-media">
					<li>
						<a href="https://www.facebook.com/themefisher">
							<i class="tf-ion-social-facebook"></i>
						</a>
					</li>
					<li>
						<a href="https://www.instagram.com/themefisher">
							<i class="tf-ion-social-instagram"></i>
						</a>
					</li>
					<li>
						<a href="https://www.twitter.com/themefisher">
							<i class="tf-ion-social-twitter"></i>
						</a>
					</li>
					<li>
						<a href="https://www.pinterest.com/themefisher/">
							<i class="tf-ion-social-pinterest"></i>
						</a>
					</li>
				</ul>
				<ul class="footer-menu text-uppercase">
					<li>
						<a href="contact">CONTACT</a>
					</li>
					<li>
						<a href="shop">SHOP</a>
					</li>
					<li>
						<a href="pricing">Pricing</a>
					</li>
					<li>
						<a href="contact">PRIVACY POLICY</a>
					</li>
				</ul>
				<p class="copyright-text">Copyright &copy;2021, Designed &amp; Developed by <a href="https://themefisher.com/">Themefisher</a></p>
			</div>
		</div>
	</div>
</footer>

    <!-- 
    Essential Scripts
    =====================================-->
    
    <!-- Main jQuery -->
    <script src="/resources/plugins/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap 3.1 -->
    <script src="/resources/plugins/bootstrap/js/bootstrap.min.js"></script>
    <!-- Bootstrap Touchpin -->
    <script src="/resources/plugins/bootstrap-touchspin/dist/jquery.bootstrap-touchspin.min.js"></script>
    <!-- Instagram Feed Js -->
    <script src="/resources/plugins/instafeed/instafeed.min.js"></script>
    <!-- Video Lightbox Plugin -->
    <script src="/resources/plugins/ekko-lightbox/dist/ekko-lightbox.min.js"></script>
    <!-- Count Down Js -->
    <script src="/resources/plugins/syo-timer/build/jquery.syotimer.min.js"></script>

    <!-- slick Carousel -->
    <script src="/resources/plugins/slick/slick.min.js"></script>
    <script src="/resources/plugins/slick/slick-animation.min.js"></script>

    <!-- Google Mapl -->
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCC72vZw-6tGqFyRhhg5CkF2fqfILn2Tsw"></script>
    <script type="text/javascript" src="/resources/plugins/google-map/gmap.js"></script>

    <!-- Main Js File -->
    <script src="/resources/js/script.js"></script>


  </body>
  </html>