<%-- 
    Document   : san-pham-moi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <div class="maincontent-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="latest-product">
                        <h2 class="section-title">Sản phẩm mới</h2>
                        <div class="product-carousel">
                        <c:forEach items="${dssp}" var="sp">
                            <div class="single-product">
                                <div class="product-f-image">
                                    <img src="img/${sp.hinhAnh}" alt="${sp.hinhAnh}">
                                    <div class="product-hover">
                                        <a href="ThemVaoGioServlet?idsp=${sp.id}&slm=1" class="add-to-cart-link"><i class="fa fa-shopping-cart"></i>Thêm vào giỏ</a><br>
                                        <a href="single-product.html" class="view-details-link"><i class="fa fa-link"></i> Xem chi tiết</a></p>
                                    </div>
                                </div>
                                
                                <h2><a href="single-product.html">${sp.tenSanPham}</a></h2>
                                
                                <div class="product-carousel-price">
                                     <del>${sp.donGia}</del> <ins>${sp.donGiaKM}</ins>
                                </div> 
                            </div>
                          </c:forEach>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- End main content area -->
    