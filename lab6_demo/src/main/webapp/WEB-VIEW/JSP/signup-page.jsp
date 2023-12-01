<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta content="IE-edge" http-equiv="X-UA-Compatible">
        <meta content="width=device-width, intial-scale=1.0" name="viewport">

        <!-- Title -->
        <title>Sign up</title>
        
        <!-- Fav-icon -->
        <link rel="shortcut icon" href="../images/fav-icon.png"/>
        
        <!-- Import-poppins-font -->
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">
        
        <!-- Import-Monoton-Font -->
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Monoton&display=swap" rel="stylesheet">
        
        <!-- Using-Font-Awesome -->
        <script src="https://kit.fontawesome.com/c8e4d183c2.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://kit.fontawesome.com/112b63e1a4.js" crossorigin="anonymous"></script>
        

        <!-- Using-Boostrap-CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

        <!-- CSS -->
        <link rel="stylesheet" href="../css/style.css">
        <style>
        body{
            font-family: poppins;
        }
        </style>
    </head>
    <body>
        <!-- Navigation -->
        <nav class="navigation">

            <!-- Menu-btn -->
            <input type="checkbox" class="menu-btn" id="menu-btn">
            <label for="menu-btn" class="menu-icon"><span class="nav-icon"></span></label>
    
            <!-- logo -->
            <a href="index.html" class="logo"> Movies<span>.hd</span></a>
    
            <!-- Menu -->
            <ul class="menu">
                <li><a href="index.html">Home</a></li>
                <li><a href="#">TV Shows</a></li>
                <li><a href="#">Movies</a></li>
                <li><a href="#">Contact</a></li>
                <li><a href="#">Login</a></li>
            </ul>
    
            <!-- Search -->
            <form action="" class="search-box">
                <!--input-->
                <input type="text" name="search" placeholder="Search Movie" class="search-input" required/>
                <!--btn-->
                <button type="submit">
                    <i class="fas fa-search"></i>
                </button>
            </form>
        </nav>
        <!-- Navigation end -->

        <!-- Profile -->
        <section class="myProfile mb-5">
            <div class="myProfileOwn bg-light shadow-lg rounded-3 overflow-hidden">
                <div class="row">
                    <!-- Content-->
                    <section class="col-lg-12 pt-lg-4 pb-4 mb-3 d-flex justify-content-center align-items-center">
                        <!-- Signup -->
                        <div class="signin pt-2 ps-lg-0" style="width: 90%;">
                            <h1 class="h3 mb-3 text-sm-start text-center">Sign up</h1>
                            <p class="text-muted mb-4" style="font-size: 0.9rem !important;">Registration takes less than a minute but gives you full control over your orders.</p>
                            <hr/>
                            <form class="needs-validation" novalidate="">
                                <div class="row gx-4 gy-3">
                                    <div class="col-sm-6 form-group">
                                        <label class="form-label" for="reg-fn">Full name</label>
                                        <input class="form-control" type="text" required="" id="reg-fn">
                                        <div class="invalid-feedback">Please enter your first name!</div>
                                    </div>
                                    <div class="col-sm-6 form-group">
                                        <label class="form-label" for="reg-ln">Username</label>
                                        <input class="form-control" type="text" required="" id="reg-ln">
                                        <div class="invalid-feedback">Please enter your last name!</div>
                                    </div>
                                    <div class="col-sm-6 form-group">
                                        <label class="form-label" for="reg-phone">Phone Number</label>
                                        <input class="form-control" type="text" required="" id="reg-phone">
                                        <div class="invalid-feedback">Please enter your phone number!</div>
                                    </div>
                                    <div class="col-sm-6 form-group">
                                        <label class="form-label" for="reg-email">E-mail Address</label>
                                        <input class="form-control" type="email" required="" id="reg-email">
                                        <div class="invalid-feedback">Please enter valid email address!</div>
                                    </div>
                                    <div class="col-sm-6 form-group">
                                        <label class="form-label" for="reg-password">Password</label>
                                        <div class="password-toggle">
                                            <input class="form-control" type="password" id="si-password" required="" ng-model="password" ng-blur="onBlur()">
                                            <label class="password-toggle-btn">
                                                <i class="fa-solid fa-eye fa-sm"></i>
                                                <i class="fa-solid fa-eye-slash fa-sm d-none"></i>
                                            </label>
                                        </div>
                                        <div class="invalid-feedback">Please enter password!</div>
                                    </div>
                                    <div class="col-sm-6 form-group">
                                        <label class="form-label" for="reg-password-confirm">Confirm Password</label>
                                        <div class="password-toggle">
                                            <input class="form-control" type="password" id="si-password" required="" ng-model="password" ng-blur="onBlur()">
                                            <label class="password-toggle-btn">
                                                <i class="fa-solid fa-eye fa-sm"></i>
                                                <i class="fa-solid fa-eye-slash fa-sm d-none"></i>
                                            </label>
                                        </div>
                                        <div class="invalid-feedback">Passwords do not match!</div>
                                    </div>
                                    <hr/>
                                    <div class="col-12 mt-0 d-flex justify-content-between">
                                        <div class="change-to-signin">
                                            <span>Already have an account?</span>
                                            <a href="" style="color: #c51e1e;">Login</a>
                                        </div>
                                        <button class="btn btn-primary" type="submit">
                                            <i class="fa-solid fa-user"></i>
                                            Sign Up
                                        </button>
                                    </div>
                                </div>
                            </form>
                        </div>
                        <!-- Signup end -->
                    </section>
                </div>
            </div>
        </section>
        <!-- Profile-end -->

        <!-- Footer -->
        <footer>
            <!-- footer-logo --->
            <a href="index.html" class="logo">
                Movies<span>hd</span>
            </a>
            <!-- copyright ----->
            <span class="copyright">
                Copyright 2023 - DungVipPro
            </span>
        </footer>

        <!-- Using-Boostrap-JS -->
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
        
        <script src="../js/jQuery.js"></script>
        
    </body>
</html>