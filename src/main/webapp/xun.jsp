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
                                    <li class="active"> <a href="/xun" class="active"> <i class="fa fa-flask icon"> <b class="bg-success"></b> </i> <span>寻</span> </a> </li>
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
                            <li class="active">寻</li>
                        </ul>
                        <div class="m-b-md">
                            <h3 class="m-b-none">Itrip DW</h3>
                            <small>Welcome, Itrip Man</small> </div>

                        <section class="panel panel-default">
                            <div class="row m-l-none m-r-none bg-light lter">
                                <table style="width:100%;" cellpadding="30">
                                    <tr>
                                        <td  >
                                            <a class="clear" href="#">
                                                <strong >寻宝次数</strong>
                                                <span class="h3 block m-t-xs"><strong>${xunTreasureCnt}</strong></span>
                                            </a>
                                        </td>
                                        <td >
                                            <a class="clear" href="#">
                                                <strong >寻宝用户数</strong>
                                                <span class="h3 block m-t-xs"><strong >${xunTreasureUserCnt}</strong></span>
                                            </a>
                                        </td>
                                        <td >
                                            <a class="clear" href="#">
                                                <strong >寻宝积分</strong>
                                                <span class="h3 block m-t-xs"><strong >${xunPointCnt} S</strong></span>
                                            </a>
                                        </td>
                                        <td >
                                            <a class="clear" href="#">
                                                <strong >寻宝金钱</strong>
                                                <span class="h3 block m-t-xs"><strong >${xunMoneyCnt} S</strong></span>
                                            </a>
                                        </td>
                                        <td >
                                            <a class="clear" href="#">
                                                <strong >寻导游次数</strong>
                                                <span class="h3 block m-t-xs"><strong>${xunGuideCnt}</strong></span>
                                            </a>
                                        </td>
                                        <td >
                                            <a class="clear" href="#">
                                                <strong >寻导游用户</strong>
                                                <span class="h3 block m-t-xs"><strong>${xunGudieUserCnt}</strong></span>
                                            </a>
                                        </td>
                                    </tr>
                                </table>
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

    var time_g1 = new Array();
    var TreasureCnt_g1 = new Array();
    var TreasureUserCnt_g1 = new Array();
    var PointCnt_g1 = new Array();
    var MoneyCnt_g1 = new Array();
    var GuideCnt_g1 = new Array();
    var GudieUserCnt_g1 = new Array();

    var time2_g1 = new Array();
    var TreasureCnt2_g1 = new Array();
    var TreasureUserCnt2_g1 = new Array();
    var PointCnt2_g1 = new Array();
    var MoneyCnt2_g1 = new Array();
    var GuideCnt2_g1 = new Array();
    var GudieUserCnt2_g1 = new Array();
    $.ajax({
        type:"post",
        url:"/xun/totalInfo",
        dataType:"json",
        success: function (data) {
            time_g1 = data[0];
            TreasureCnt_g1 = data[1];
            TreasureUserCnt_g1 = data[2];
            PointCnt_g1 = data[3];
            MoneyCnt_g1 = data[4];
            GuideCnt_g1 = data[5];
            GudieUserCnt_g1 = data[6];

            for (var i = 0; i < time_g1.length; i++) {
                time2_g1[i] = time_g1[i].toString();
                TreasureCnt2_g1[i] = parseInt(TreasureCnt_g1[i]);
                TreasureUserCnt2_g1[i] = parseInt(TreasureUserCnt_g1[i]);
                PointCnt2_g1[i] = parseInt(PointCnt_g1[i]);
                MoneyCnt2_g1[i] = parseFloat(MoneyCnt_g1[i]);
                GuideCnt2_g1[i] = parseInt(GuideCnt_g1[i]);
                GudieUserCnt2_g1[i] = parseInt(GudieUserCnt_g1[i]);

            }

            var myChart = echarts.init(document.getElementById('graph1'));
            myChart.setOption(option1);
        }
    });

    option1 = {
        title: {
            text: '寻宝统计'
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
            data:['寻宝次数','寻宝用户数','寻宝积分','寻宝金钱','寻导游次数','寻导游用户']
        },
        toolbox: {
            feature: {
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
                data : time2_g1,
                axisLabel: {
                    interval:0,
                    rotate:40
                }
            }
        ],
        yAxis : [
            {
                type : 'value'
            }
        ],
        series : [
            {
                name:'寻宝次数',
                type:'line',
                stack: '总量',
                areaStyle: {},
                data:TreasureCnt2_g1
            },
            {
                name:'寻宝用户数',
                type:'line',
                stack: '总量',
                areaStyle: {},
                data:TreasureUserCnt2_g1
            },
            {
                name:'寻宝积分',
                type:'line',
                stack: '总量',
                areaStyle: {},
                data:PointCnt2_g1
            },
            {
                name:'寻宝金钱',
                type:'line',
                stack: '总量',
                areaStyle: {normal: {}},
                data:MoneyCnt2_g1
            },
            {
                name:'寻导游次数',
                type:'line',
                stack: '总量',
                areaStyle: {normal: {}},
                data:GuideCnt2_g1
            },
            {
                name:'寻导游用户',
                type:'line',
                stack: '总量',
                label: {
                    normal: {}
                },
                areaStyle: {normal: {}},
                data:GudieUserCnt2_g1
            }
        ]
    };

    var city_g2 ;
    var TreasureCnt_g2 ;
    var TreasureUserCnt_g2;
    var PointCnt_g2;
    var MoneyCnt_g2;
    var GuideCnt_g2;
    var GudieUserCnt_g2;

    var city2_g2 = new Array();
    var TreasureCnt2_g2 = new Array();
    var TreasureUserCnt2_g2 = new Array();
    var PointCnt2_g2 = new Array();
    var MoneyCnt2_g2 = new Array();
    var GuideCnt2_g2 = new Array();
    var GudieUserCnt2_g2 = new Array();
    $.ajax({
        type:"post",
        url:"/xun/cityInfo",
        dataType:"json",
        success: function (data) {
            city_g2 = data[0];
            TreasureCnt_g2 = data[1];
            TreasureUserCnt_g2 = data[2];
            PointCnt_g2 = data[3];
            MoneyCnt_g2 = data[4];
            GuideCnt_g2 = data[5];
            GudieUserCnt_g2 = data[6];

            for (var i = 0; i < city_g2.length; i++) {
                city2_g2[i] = city_g2[i].toString();
                TreasureCnt2_g2[i] = parseInt(TreasureCnt_g2[i]);
                TreasureUserCnt2_g2[i] = parseInt(TreasureUserCnt_g2[i]);
                PointCnt2_g2[i] = parseInt(PointCnt_g2[i]);
                MoneyCnt2_g2[i] = parseFloat(MoneyCnt_g2[i]);
                GuideCnt2_g2[i] = parseInt(GuideCnt_g2[i]);
                GudieUserCnt2_g2[i] = parseInt(GudieUserCnt_g2[i]);

            }

            var myChart = echarts.init(document.getElementById('graph2'));
            myChart.setOption(option2);
        }
    });

    option2 = {
        title: {
            text: '城市统计'
        },
        tooltip: {
            trigger: 'axis'
        },
        legend: {
            data:['寻宝次数','寻宝用户数','寻宝积分','寻宝金钱','寻导游用户数','寻导游次数']
        },
        grid: {
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        toolbox: {
            feature: {
                dataView: {show: true, readOnly: false},
                magicType: {show: true, type: ['line', 'bar']},
                restore: {show: true},
                saveAsImage: {show: true}
            }
        },
        xAxis: {
            type: 'category',
            boundaryGap: false,
            data:city2_g2
        },
        yAxis: {
            type: 'value'
        },
        series: [
            {
                name:'寻宝次数',
                type:'line',
                stack: '总量',
                data:TreasureCnt2_g2
            },
            {
                name:'寻宝用户数',
                type:'line',
                stack: '总量',
                data:TreasureUserCnt2_g2
            },
            {
                name:'寻宝积分',
                type:'line',
                stack: '总量',
                data:PointCnt2_g2
            },
            {
                name:'寻宝金钱',
                type:'line',
                stack: '总量',
                data:MoneyCnt2_g2
            },
            {
                name:'寻导游次数',
                type:'line',
                stack: '总量',
                data:GuideCnt2_g2
            },
            {
                name:'寻导游用户数',
                type:'line',
                stack: '总量',
                data:GudieUserCnt2_g2
            }
        ]
    };


    var TreasureType_g3 ;
    var TreasureCnt_g3 ;
    var TreasureUserCnt_g3;
    var PointCnt_g3;
    var MoneyCnt_g3;

    var TreasureType2_g3 = new Array();
    var TreasureCnt2_g3 = new Array();
    var TreasureUserCnt2_g3 = new Array();
    var PointCnt2_g3 = new Array();
    var MoneyCnt2_g3 = new Array();

    $.ajax({
        type:"post",
        url:"/xun/treasureTypeInfo",
        dataType:"json",
        success: function (data) {
            TreasureType_g3 = data[0];
            TreasureCnt_g3 = data[1];
            TreasureUserCnt_g3 = data[2];
            PointCnt_g3 = data[3];
            MoneyCnt_g3 = data[4];

            for (var i = 0; i < TreasureType_g3.length; i++) {
                TreasureType2_g3[i] = TreasureType_g3[i].toString();
                TreasureCnt2_g3[i] = parseInt(TreasureCnt_g3[i]);
                TreasureUserCnt2_g3[i] = parseInt(TreasureUserCnt_g3[i]);
                PointCnt2_g3[i] = parseInt(PointCnt_g3[i]);
                MoneyCnt2_g3[i] = parseFloat(MoneyCnt_g3[i]);

            }

            var myChart = echarts.init(document.getElementById('graph3'));
            myChart.setOption(option3);
        }
    });

    option3 = {
        title: {
            text: '宝藏类型统计'
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
            data: ['寻宝次数', '寻宝用户数','寻宝积分','寻宝金钱']
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
            data: TreasureType2_g3
        },
        series: [
            {
                name: '寻宝次数',
                type: 'bar',
                stack: '总量',
                label: {
                    normal: {
                        show: true,
                        position: 'insideRight'
                    }
                },
                data: TreasureCnt2_g3
            },
            {
                name: '寻宝用户数',
                type: 'bar',
                stack: '总量',
                label: {
                    normal: {
                        show: true,
                        position: 'insideRight'
                    }
                },
                data: TreasureUserCnt2_g3
            },
            {
                name: '寻宝积分',
                type: 'bar',
                stack: '总量',
                label: {
                    normal: {
                        show: true,
                        position: 'insideRight'
                    }
                },
                data: PointCnt2_g3
            },
            {
                name: '寻宝金钱',
                type: 'bar',
                stack: '总量',
                label: {
                    normal: {
                        show: true,
                        position: 'insideRight'
                    }
                },
                data: MoneyCnt2_g3
            }
        ]
    };


    var myChart = echarts.init(document.getElementById('graph3'));
    myChart.setOption(option3);





    option4 = {
        title : {
            text: '景点类别寻导游统计',
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