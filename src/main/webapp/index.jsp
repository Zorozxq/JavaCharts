<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" class="app">
<head>
    <meta charset="utf-8" />
    <title>Itrip | Data Warehouse</title>
    <meta name="description" content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    <link rel="stylesheet" href="css/app.v2.css" type="text/css" />
    <link rel="stylesheet" href="js\calendar/bootstrap_calendar.css" type="text/css" cache="false" />
    <!--[if lt IE 9]> <script src="js/ie/html5shiv.js" cache="false"></script> <script src="js/ie/respond.min.js" cache="false"></script> <script src="js/ie/excanvas.js" cache="false"></script> <![endif]-->
</head>
<body>
<section class="vbox">
    <header class="bg-dark dk header navbar navbar-fixed-top-xs">
        <div class="navbar-header aside-md"> <a class="btn btn-link visible-xs" data-toggle="class:nav-off-screen" data-target="#nav"> <i class="fa fa-bars"></i> </a> <a href="#" class="navbar-brand" data-toggle="fullscreen"><img src="images/logo.png" class="m-r-sm">Itrip</a>
            <a class="btn btn-link visible-xs" data-toggle="dropdown" data-target=".nav-user"> <i class="fa fa-cog"></i> </a> </div>

        <ul class="nav navbar-nav navbar-right hidden-xs nav-user">
            <li class="dropdown"> <a href="#" class="dropdown-toggle" data-toggle="dropdown"> <span class="thumb-sm avatar pull-left"> <img src="images/avatar.jpg"> </span> John.Smith <b class="caret"></b> </a>
                <ul class="dropdown-menu animated fadeInRight">
                    <span class="arrow top"></span>
                    <li> <a href="#">Settings</a> </li>
                    <li> <a href="profile.html">Profile</a> </li>
                    <li> <a href="#"> <span class="badge bg-danger pull-right"></span> Notifications </a> </li>
                    <li> <a href="docs.html">Help</a> </li>
                    <li class="divider"></li>
                    <li> <a href="modal.lockme.html" data-toggle="ajaxModal" >退出</a> </li>
                </ul>
            </li>
        </ul>
    </header>
    <section>
        <section class="hbox stretch"> <!-- .aside -->
            <aside class="bg-dark lter aside-md hidden-print" id="nav">
                <section class="vbox">
                    <section class="w-f scrollable">
                        <div class="slim-scroll" data-height="auto" data-disable-fade-out="true" data-distance="0" data-size="5px" data-color="#333333"> <!-- nav -->
                            <nav class="nav-primary hidden-xs">
                                <ul class="nav">
                                    <li class="active"> <a href="/index" class="active"> <i class="fa fa-dashboard icon"> <b class="bg-danger"></b> </i> <span>首页</span> </a> </li>
                                    <li > <a href="/ting" class="active"> <i class="fa fa-columns icon"> <b class="bg-warning"></b> </i> <span>听</span> </a> </li>
                                    <li > <a href="/xun" class="active"> <i class="fa fa-flask icon"> <b class="bg-success"></b> </i> <span>寻</span> </a> </li>
                                    <li > <a href="/cang" class="active"> <i class="fa fa-file-text icon"> <b class="bg-primary"></b> </i> <span>藏</span> </a> </li>
                                    <li > <a href="/liu" class="active"> <i class="fa fa-envelope-o icon"> <b class="bg-primary dker"></b> </i> <span>留</span> </a> </li>
                                    <li > <a href="/analyze" > <i class="fa fa-pencil icon"> <b class="bg-info"></b> </i> <span>用户分析</span> </a> </li>
                                </ul>
                            </nav>
                        </div>
                    </section>

                    <footer class="footer lt hidden-xs b-t b-dark">
                        <a href="#nav" data-toggle="class:nav-xs" class="pull-right btn btn-sm btn-dark btn-icon"> <i class="fa fa-angle-left text"></i> <i class="fa fa-angle-right text-active"></i> </a>
                    </footer>
                </section>
            </aside>
            <!-- /.aside -->

            <section id="content">
                <section class="vbox">
                    <section class="scrollable padder">
                        <ul class="breadcrumb no-border no-radius b-b b-light pull-in">
                            <li><a href="index.html"><i class="fa fa-home"></i> Home</a></li>
                            <li class="active">首页</li>
                        </ul>
                        <div class="m-b-md">
                            <h3 class="m-b-none">事实表详情 </h3>
                            <table style="border:1px solid black;width:90%;">
                                <thead>
                                <td style="width:15%;">事实表名</td>
                                <td style="width:15%;">产品线</td>
                                <td style="width:15%;">是否有效</td>
                                <td style="width:15%;">创建者</td>
                                <td style="width:15%;">创建时间</td>
                                <td style="width:10%;">操作</td>
                                </thead>
                                <tbody>
                                <tr>
                                    <td style="width:15%;">dwd_ting</td>
                                    <td style="width:15%;">听</td>
                                    <td style="width:15%;">是</td>
                                    <td style="width:15%;">张学清</td>
                                    <td style="width:15%;">2018-11-29</td>
                                    <td style="width:10%;">编辑<a href="#modal" onclick="show(3)" data-toggle="modal"><i class="fa fa-search-plus"></i></a></td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                        <div class="m-b-md">
                            <h3 class="m-b-none">指标</h3>
                            <table style="border:1px solid black;width:90%;">
                                <thead>
                                <td style="width:15%;">指标名</td>
                                <td style="width:15%;">产品线</td>
                                <td style="width:15%;">是否有效</td>
                                <td style="width:15%;">创建者</td>
                                <td style="width:15%;">创建时间</td>
                                <td style="width:10%;">操作</td>
                                </thead>
                                <tbody>
                                <tr>
                                    <td style="width:15%;">ting_cnt</td>
                                    <td style="width:15%;">听</td>
                                    <td style="width:15%;">是</td>
                                    <td style="width:15%;">张学清</td>
                                    <td style="width:15%;">2018-11-29</td>
                                    <td style="width:10%;">编辑<a href="#modal" onclick="show(3)" data-toggle="modal"><i class="fa fa-search-plus"></i></a></td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                        <div class="m-b-md">
                            <h3 class="m-b-none">维度</h3>
                            <table style="border:1px solid black;width:90%;">
                                <thead>
                                <td style="width:15%;">维度名</td>
                                <td style="width:15%;">产品线</td>
                                <td style="width:15%;">是否有效</td>
                                <td style="width:15%;">创建者</td>
                                <td style="width:15%;">创建时间</td>
                                <td style="width:10%;">操作</td>
                                </thead>
                                <tbody>
                                <tr>
                                    <td style="width:15%;">city</td>
                                    <td style="width:15%;">听</td>
                                    <td style="width:15%;">是</td>
                                    <td style="width:15%;">张学清</td>
                                    <td style="width:15%;">2018-11-29</td>
                                    <td style="width:10%;">编辑<a href="#modal" onclick="show(3)" data-toggle="modal"><i class="fa fa-search-plus"></i></a></td>
                                </tr>
                                </tbody>
                            </table>
                        </div>

                    </section>
                </section>


            </section>



        </section>
        <a href="#" class="hide nav-off-screen-block" data-toggle="class:nav-off-screen" data-target="#nav"></a> </section>
    <aside class="bg-light lter b-l aside-md hide" id="notes">
        <div class="wrapper">Notification</div>
    </aside>
</section>
</section>
</section>
<script src="js/app.v2.js"></script> <!-- Bootstrap -->
<!-- App --> <!-- fuelux --><script src="js/libs/underscore-min.js" cache="false"></script>
<script src="js/fuelux/fuelux.js" cache="false"></script>
<script src="js/fuelux/demo.datagrid.js" cache="false"></script>
<div class="modal fade" id="modal" >
    <div class="modal-dialog" style="width:1200px;height:700px">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title"> Itrip</h4>
            </div>
            <div class="modal-body" id="modal-graph" style="width:1200px;height:600px;">

            </div>

        </div>
        <!-- /.modal-content --> </div>
    <!-- /.modal-dialog --> </div>

</body>
</html>
