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
                                    <li > <a href="/index" class="active"> <i class="fa fa-dashboard icon"> <b class="bg-danger"></b> </i> <span>首页</span> </a> </li>
                                    <li > <a href="/ting" class="active"> <i class="fa fa-columns icon"> <b class="bg-warning"></b> </i> <span>听</span> </a> </li>
                                    <li > <a href="/xun" class="active"> <i class="fa fa-flask icon"> <b class="bg-success"></b> </i> <span>寻</span> </a> </li>
                                    <li > <a href="/cang" class="active"> <i class="fa fa-file-text icon"> <b class="bg-primary"></b> </i> <span>藏</span> </a> </li>
                                    <li class="active"> <a href="/liu" class="active"> <i class="fa fa-envelope-o icon"> <b class="bg-primary dker"></b> </i> <span>留</span> </a> </li>
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
                            <li class="active">留</li>
                        </ul>
                        <div class="m-b-md">
                            <h3 class="m-b-none">Itrip DW</h3>
                            <small>Welcome, Itrip Man</small> </div>

                        <section class="panel panel-default">
                            <div class="row m-l-none m-r-none bg-light lter">
                                <div class="col-sm-6 col-md-3 padder-v b-r b-light"><span class="fa-stack fa-2x pull-left m-r-sm"><i class="fa fa-circle fa-stack-2x text-info"></i><i class="fa fa-male fa-stack-1x text-white"></i></span>
                                    <a class="clear" href="#">
                                        <strong >留总次数</strong>
                                        <span class="h3 block m-t-xs"><strong>${liuTotalCount}</strong></span>
                                    </a>
                                </div>
                                <div class="col-sm-6 col-md-3 padder-v b-r b-light lt"><span class="fa-stack fa-2x pull-left m-r-sm"><i class="fa fa-circle fa-stack-2x text-warning"></i><i class="fa fa-bug fa-stack-1x text-white"></i><span class="easypiechart pos-abt" data-percent="100" data-line-width="4" data-track-Color="#fff" data-scale-Color="false" data-size="50" data-line-cap='butt' data-animate="2000" data-target="#bugs" data-update="3000"></span></span>
                                    <a class="clear" href="#">
                                        <strong >留用户数</strong>
                                        <span class="h3 block m-t-xs"><strong >${liuUserCount}</strong></span>
                                    </a>
                                </div>
                                <div class="col-sm-6 col-md-3 padder-v b-r b-light"> <span class="fa-stack fa-2x pull-left m-r-sm"><i class="fa fa-circle fa-stack-2x text-danger"></i> <i class="fa fa-fire-extinguisher fa-stack-1x text-white"></i><span class="easypiechart pos-abt" data-percent="100" data-line-width="4" data-track-Color="#f5f5f5" data-scale-Color="false" data-size="50" data-line-cap='butt' data-animate="3000" data-target="#firers" data-update="5000"></span> </span>
                                    <a class="clear" href="#">
                                        <strong >平均语音时长</strong>
                                        <span class="h3 block m-t-xs"><strong >${avgDuration} S</strong></span>
                                    </a>
                                </div>
                                <div class="col-sm-6 col-md-3 padder-v b-r b-light lt"> <span class="fa-stack fa-2x pull-left m-r-sm"><i class="fa fa-circle fa-stack-2x icon-muted"></i><i class="fa fa-clock-o fa-stack-1x text-white"></i></span>
                                    <a class="clear" href="#">
                                        <strong >平均播放时长</strong>
                                        <span class="h3 block m-t-xs"><strong >${maxDuration} S</strong></span>
                                    </a>
                                </div>
                            </div>
                        </section>

                        <div class="row m-l-none m-r-none bg-light lter">
                            <table style="width:100%;" cellpadding="30">
                                <tr>
                                    <td style="width:50%">
                                        <a href="#modal" onclick="show(1)" data-toggle="modal"><i class="fa fa-search-plus"></i></a>
                                        <div id="graph1" style="width: 600px;height:400px;"></div>
                                    </td>
                                    <td style="width:50%">
                                        <a href="#modal" onclick="show(2)" data-toggle="modal"><i class="fa fa-search-plus"></i></a>
                                        <div id="graph2" style="width: 600px;height:400px;"></div>
                                    </td>
                                </tr>
                                <tr valign="bottom">
                                    <td style="width:50%">
                                        <a href="#modal" onclick="show(3)" data-toggle="modal"><i class="fa fa-search-plus"></i></a>
                                        <div id="graph3" style="width: 600px;height:400px;"></div>
                                    </td>
                                    <td style="width:50%">
                                        <a href="#modal" onclick="show(4)" data-toggle="modal"><i class="fa fa-search-plus"></i></a>
                                        <div id="graph4" style="width: 600px;height:400px;"></div>
                                    </td>
                                </tr>
                            </table>
                        </div>

                    </section>
                </section>
                <a href="#" class="hide nav-off-screen-block" data-toggle="class:nav-off-screen" data-target="#nav"></a>

            </section>
            <aside class="bg-light lter b-l aside-md hide" id="notes">
                <div class="wrapper">Notification</div>
            </aside>
        </section>
    </section>
</section>
<script src="js/app.v2.js"></script><script src="js/echarts.min.js"></script> <!-- Bootstrap --> <!-- App --> <script src="js/charts/easypiechart/jquery.easy-pie-chart.js" cache="false"></script> <script src="js/charts/sparkline/jquery.sparkline.min.js" cache="false"></script> <script src="js/charts/flot/jquery.flot.min.js" cache="false"></script> <script src="js/charts/flot/jquery.flot.tooltip.min.js" cache="false"></script> <script src="js/charts/flot/jquery.flot.resize.js" cache="false"></script> <script src="js/charts/flot/jquery.flot.grow.js" cache="false"></script> <script src="js/charts/flot/demo.js" cache="false"></script> <script src="js/calendar/bootstrap_calendar.js" cache="false"></script> <script src="js/calendar/demo.js" cache="false"></script> <script src="js/sortable/jquery.sortable.js" cache="false"></script>
<script>

    option1 = {
        title: {
            text: '总变化图'

        },
        tooltip : {
            trigger: 'axis',
            axisPointer: {
                type: 'cross',
                label: {
                    backgroundColor: '#6a7985'
                }
            }
        },
        legend: {
            data:['留用户总数','留总次数']
        },
        toolbox: {
            feature: {
                mark : {show: true},
                dataView: {show: true, readOnly: false},
                magicType: {show: true, type: ['line', 'bar']},
                restore: {show: true},
                saveAsImage: {show: true}
            }
        },
        grid: {
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        xAxis : [
            {
                type : 'category',
                boundaryGap : false,
                data : ['1日','2日','3日','4日','5日','6日','7日']
            }
        ],
        yAxis : [
            {
                type : 'value'
            }
        ],
        series : [
            {
                name:'留用户总数',
                type:'line',
                stack: '总量',
                areaStyle: {},
                data:[150, 232, 201, 154, 190, 330, 410]
            },

            {
                name:'留总次数',
                type:'line',
                stack: '总量',
                label: {
                    normal: {
                        show: true,
                        position: 'top'
                    }
                },
                areaStyle: {normal: {}},
                data:[820, 932, 901, 934, 1290, 1330, 1320]
            }
        ]
    };

    var myChart = echarts.init(document.getElementById('graph1'));
    myChart.setOption(option1);

    option2 = {
        title: {
            "text": "性别统计图"
        },
        tooltip: {
            trigger: 'axis',
            axisPointer: {
                type: 'cross',
                crossStyle: {
                    color: '#999'
                }
            }
        },
        toolbox: {
            feature: {
                dataView: {show: true, readOnly: false},
                magicType: {show: true, type: ['line', 'bar']},
                restore: {show: true},
                saveAsImage: {show: true}
            }
        },
        legend: {
            data:['男','女','平均数']
        },
        grid: {
            left: '3%',   //距离左边的距离
            right: '6%', //距离右边的距离
            bottom: '5%',//距离下边的距离
        },
        xAxis: [
            {
                type: 'category',
                data: ['1日','2日','3日','4日','5日','6日','7日','8日','9日','10日','11日','12日'],
                axisPointer: {
                    type: 'shadow'
                }
            }
        ],
        yAxis: [
            {
                type: 'value',
                name: '数据',
                min: 0,
                max: 250,
                interval: 50,
                axisLabel: {
                    formatter: '{value} ml'
                }
            },
            {
                type: 'value',
                name: '温度',
                min: 0,
                max: 25,
                interval: 5,
                axisLabel: {
                    formatter: '{value} °C'
                }
            }
        ],
        series: [
            {
                name:'男',
                type:'bar',
                data:[2.0, 4.9, 7.0, 23.2, 25.6, 76.7, 135.6, 162.2, 32.6, 20.0, 6.4, 3.3]
            },
            {
                name:'女',
                type:'bar',
                data:[2.6, 5.9, 9.0, 26.4, 28.7, 70.7, 175.6, 182.2, 48.7, 18.8, 6.0, 2.3]
            },
            {
                name:'平均数',
                type:'line',
                yAxisIndex: 1,
                data:[2.0, 2.2, 3.3, 4.5, 6.3, 10.2, 20.3, 23.4, 23.0, 16.5, 12.0, 6.2]
            }
        ]
    };

    var myChart = echarts.init(document.getElementById('graph2'));
    myChart.setOption(option2);


    option3 = {
        title: {
            text: '城市统计'
        },
        tooltip : {
            trigger: 'axis',
            axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
            }
        },
        toolbox: {
            feature: {
                dataView: {show: true, readOnly: false},

                saveAsImage: {show: true}
            }
        },
        legend: {
            data: ['留用户数', '留次数']
        },
        grid: {
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        xAxis:  {
            type: 'value'
        },
        yAxis: {
            type: 'category',
            data: ['周一','周二','周三','周四','周五','周六','周日']
        },
        series: [
            {
                name: '留用户数',
                type: 'bar',
                stack: '总量',
                label: {
                    normal: {
                        show: true,
                        position: 'insideRight'
                    }
                },
                data: [320, 302, 301, 334, 390, 330, 320]
            },
            {
                name: '留次数',
                type: 'bar',
                stack: '总量',
                label: {
                    normal: {
                        show: true,
                        position: 'insideRight'
                    }
                },
                data: [120, 132, 101, 134, 90, 230, 210]
            }
        ]
    };


    var myChart = echarts.init(document.getElementById('graph3'));
    myChart.setOption(option3);





    option5 = {
        title : {
            text: '景点类别统计',
            x:'center'
        },
        tooltip: {
            trigger: 'item',
            formatter: "{a} <br/>{b}: {c} ({d}%)"
        },
        toolbox: {
            feature: {
                dataView: {show: true, readOnly: false},
                magicType: {show: true, type: ['line', 'bar']},
                restore: {show: true},
                saveAsImage: {show: true}
            }
        },
        legend: {
            orient: 'vertical',
            x: 'left',
            data:['直接访问','邮件营销','联盟广告','视频广告','搜索引擎']
        },
        series: [
            {
                name:'访问来源',
                type:'pie',
                radius: ['50%', '70%'],
                avoidLabelOverlap: false,
                label: {
                    normal: {
                        show: false,
                        position: 'center'
                    },
                    emphasis: {
                        show: true,
                        textStyle: {
                            fontSize: '30',
                            fontWeight: 'bold'
                        }
                    }
                },
                labelLine: {
                    normal: {
                        show: false
                    }
                },
                data:[
                    {value:335, name:'直接访问'},
                    {value:310, name:'邮件营销'},
                    {value:234, name:'联盟广告'},
                    {value:135, name:'视频广告'},
                    {value:1548, name:'搜索引擎'}
                ]
            }
        ]
    };

    var options = [option1, option2, option3, option4];
    var myChart = echarts.init(document.getElementById('graph4'));
    myChart.setOption(option4);

    function show(i) {
        var myChart = echarts.init(document.getElementById('modal-graph'));
        myChart.clear();
        myChart.setOption(options[i - 1]);
    }

</script>
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