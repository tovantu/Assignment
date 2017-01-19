package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class baodanh_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/includes/headtag.jsp");
    _jspx_dependants.add("/includes/header.jsp");
    _jspx_dependants.add("/includes/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Điểm Danh</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"http://www.w3schools.com/lib/w3.css\">\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.js\" type=\"text/javascript\"></script>  ");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<header class=\"container-fluid\">\n");
      out.write("    \n");
      out.write("    <div class=\"row\">\n");
      out.write("        <nav class=\"navbar navbar-inverse menu-bar\" id=\"nav\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span> \n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                    <ul class=\"nav navbar-nav \">\n");
      out.write("                        <li><a href=\"index.jsp\" class=\"menu active\"><span class=\"glyphicon glyphicon-home\"></span></a></li>\n");
      out.write("                        <!--<li><a href=\"addproduct.jsp\" class=\"menu\">Thêm sản phẩm</a></li>-->\n");
      out.write("<!--                        <\n");
      out.write("                            if (session.getAttribute(\"tenHo\") != null) {\n");
      out.write("                        >-->\n");
      out.write("                        \n");
      out.write("<!--                            <                                }\n");
      out.write("                            >-->\n");
      out.write("                        \n");
      out.write("                        <li><a href=\"baodanh.jsp\" class=\"menu\">Báo Danh</a></li>\n");
      out.write("                        <li><a href=\"quanly.jsp\" class=\"menu\">Quản Lý</a></li>\n");
      out.write("                        <li><a href=\"lienhe.jsp\" class=\"menu\">Liên hệ</a></li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li> <hr></li>\n");
      out.write("<!--                            \n");
      out.write("                                if (session.getAttribute(\"email\") == null) {\n");
      out.write("                            -->\n");
      out.write("                        <li><a href=\"\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-user\"></span> Đăng ký\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#myModal\" style=\"outline: none;\" data-toggle=\"modal\"><span class=\"glyphicon glyphicon-log-in\"></span> Đăng nhập</a>\n");
      out.write("\n");
      out.write("                            <div id=\"myModal\" style=\"margin-top: 130px;\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("                                <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("                                    <!-- Modal content-->\n");
      out.write("                                    <div class=\"modal-content\">\n");
      out.write("                                        <div class=\"modal-header\">\n");
      out.write("                                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                                            <h4 class=\"modal-title\"><i class=\"glyphicon glyphicon-user\"></i> Đăng nhập</h4>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <form class=\"form-horizontal\"action=\"LoginServlet\" method=\"post\">\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label class=\"control-label col-sm-3\" for=\"email\"> Tên đăng nhập</label>\n");
      out.write("                                                <div class=\"col-sm-8\">\n");
      out.write("                                                    <input type=\"text\" name=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Nhập tên đăng nhập\">\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label class=\"control-label col-sm-3\" for=\"pwd\">Mật khẩu</label>\n");
      out.write("                                                <div class=\"col-sm-8\"> \n");
      out.write("                                                    <input type=\"password\" name=\"pw\" class=\"form-control\" id=\"pwd\" placeholder=\"Nhập mật khẩu\">\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group\"> \n");
      out.write("                                                <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                                                    <button type=\"submit\" class=\"btn btn-info\" style=\"margin-left: 150px;\">Đăng nhập</button>\n");
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                        </form>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <!--<ul id=\"login-dp\" class=\"dropdown-menu\">-->\n");
      out.write("<!--                        \n");
      out.write("                        } else {\n");
      out.write("                        -->\n");
      out.write("                        <li class=\"dropdown-submenu menu dropdown\">\n");
      out.write("                            <a href=\"index.jsp\" class=\"dropdown-toggle menu dropbtn\">\n");
      out.write("<!--                                <i class=\"glyphicon glyphicon-user\"> <strong style=\"color: white\"><=session.getAttribute(\"fullname\")> </strong></i>-->\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"dropdown-menu menu dropdown-content\">\n");
      out.write("                                \n");
      out.write("                                    <a href=\"logout.jsp\"><span class=\"glyphicon glyphicon-log-out\"></span>Thoát</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("<!--                        <\n");
      out.write("                            }\n");
      out.write("                        >-->\n");
      out.write("                        <!--</ul>-->\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("</header>");
      out.write("\n");
      out.write("        <section class=\"container-fluid\">\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("\n");
      out.write("                            <div class=\"panel-heading\">Danh mục người dùng\n");
      out.write("                                <!--                                <form action=\"SearchServlet\" method=\"post\">\n");
      out.write("                                                                    <div class=\"searchus\">\n");
      out.write("                                                                        <input type=\"text\" style=\"float: right;    width: 300px;\" name=\"username\" class=\"form-control input-sm\" maxlength=\"64\" placeholder=\"Search\" />\n");
      out.write("                                                                        <button type=\"submit\" style=\"    margin-left: 645px;\" class=\"btn btn-primary btn-sm searchbtn\">Search</button>\n");
      out.write("                                                                    </div>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <form action=\"\" method=\"post\">\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>\n");
      out.write("                                        <select name=\"tacvu\" class=\"form-control-static\">\n");
      out.write("                                            <option value=\"\">Tác vụ</option>\n");
      out.write("                                            <option value=\"xoa\">Điểm danh</option>\n");
      out.write("                                        </select>\n");
      out.write("                                        <input class=\"btn btn-danger\" type=\"submit\" value=\"Thực hiện\" />\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Table -->\n");
      out.write("                                <script type=\"text/javascript\">\n");
      out.write("//                                    function check(source) {\n");
      out.write("//                                        checkboxes = document.getElementsByName('iduser');\n");
      out.write("//                                        for (var i = 0; i < checkboxes.length; i++) {\n");
      out.write("//                                            checkboxes[i].checked = source.checked;\n");
      out.write("//                                        }\n");
      out.write("//                                    }\n");
      out.write("                                </script>\n");
      out.write("                                ");

//                                    int pageSize = 10;
//                                    int pageNumber = 1;
//                                    String url = "UserManager.jsp";
//                                    UserService ps = new UserService();
//                                    ArrayList<User> listUser = null;
//
//                                    if (request.getParameter("pagenumber") != null) {
//                                        session.setAttribute("pagenumber", request.getParameter("pagenumber"));
//                                        pageNumber = Integer.parseInt(request.getParameter("pagenumber"));
//                                    } else {
//                                        session.setAttribute("pagenumber", "1");
//                                    }
//
//                                    listUser = ps.getAllUser(pageSize, pageNumber);
//
//                                    int pageCount = (ps.usertcount) / pageSize + (ps.usertcount % pageSize > 0 ? 1 : 0);
//
//                                    String nextPage = (pageCount > pageNumber ? (pageNumber + 1) : pageNumber) + "";
//                                    String prevPage = (pageNumber <= 1 ? 1 : pageNumber - 1) + "";


                                
      out.write("\n");
      out.write("                                <table class=\"table\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th><input type=\"checkbox\" onclick=\"check(this)\" /></th> \n");
      out.write("                                            <th>TT</th>                        \n");
      out.write("                                            <th>Tên đăng nhập</th>                        \n");
      out.write("\n");
      out.write("                                            <th>Họ tên</th>                        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            <th>Hình đại diện</th>\n");
      out.write("                                            <th>Trạng thái</th>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        ");
 //                                    for (int i = 0; i < listUser.size(); i++) {
//                                                User user = listUser.get(i);
//                                                int dem =i+1;
//                                                if(pageNumber>1){
//                                                    dem=i+pageSize * (pageNumber -1)+1;
//                                                }
                                        
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th><input type=\"checkbox\" name=\"iduser\" value=\"<>\" /></th>\n");
      out.write("                                            \n");
      out.write("\n");
      out.write("                                           \n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("                                        ");


//                                            }
                                        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </tbody>\n");
      out.write("\n");
      out.write("                                </table>\n");
      out.write("                            </form>\n");
      out.write("\n");
      out.write("                            ");

//                                if (pageCount != 1) {
                            
      out.write("\n");
      out.write("                            <div class=\"panel-footer\">\n");
      out.write("                                <nav aria-label=\"Page navigation\">\n");
      out.write("                                    <ul class=\"pagination\">\n");
      out.write("                                        \n");
      out.write("                                    </ul>\n");
      out.write("                                </nav>\n");
      out.write("                            </div>\n");
      out.write("                            ");

//                                }
                            
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </section>\n");
      out.write("        ");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<footer>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"wrap-footer\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3 col-footer footer-1\">\n");
      out.write("                    <img src=\"images/logofooter.png\" />\n");
      out.write("                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry.Lorem Ipsum is simply dummy text of the printing and typesetting industry.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3 col-footer footer-2\">\n");
      out.write("                    <div class=\"heading\"><h4>Customer Service</h4></div>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\">About Us</a></li>\n");
      out.write("                        <li><a href=\"#\">Delivery Information</a></li>\n");
      out.write("                        <li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("                        <li><a href=\"#\">Terms & Conditions</a></li>\n");
      out.write("                        <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3 col-footer footer-3\">\n");
      out.write("                    <div class=\"heading\"><h4>My Account</h4></div>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\">My Account</a></li>\n");
      out.write("                        <li><a href=\"#\">Brands</a></li>\n");
      out.write("                        <li><a href=\"#\">Gift Vouchers</a></li>\n");
      out.write("                        <li><a href=\"#\">Specials</a></li>\n");
      out.write("                        <li><a href=\"#\">Site Map</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3 col-footer footer-4\">\n");
      out.write("                    <div class=\"heading\"><h4>Contact Us</h4></div>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><span class=\"glyphicon glyphicon-home\"></span>California, United States 3000009</li>\n");
      out.write("                        <li><span class=\"glyphicon glyphicon-earphone\"></span>+91 8866888111</li>\n");
      out.write("                        <li><span class=\"glyphicon glyphicon-envelope\"></span>infor@yoursite.com</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"copyright\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    Your Store © 20xx - <a href=\"http://www.365bootstrap.com\" rel=\"nofollow\" target=\"_blank\">Ecommerce Themes</a> Designed by <a href=\"http://www.365bootstrap.com\" rel=\"nofollow\" target=\"_blank\">365BOOTSTRAP</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"pull-right\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><img src=\"images/visa-curved-32px.png\" /></li>\n");
      out.write("                            <li><img src=\"images/paypal-curved-32px.png\" /></li>\n");
      out.write("                            <li><img src=\"images/discover-curved-32px.png\" /></li>\n");
      out.write("                            <li><img src=\"images/maestro-curved-32px.png\" /></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
