<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<h2>Welcome!</h2>

<div id="myCarousel" class="carousel slide" data-ride="carousel">

	<ol class="carousel-indicators">
		<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
		<li data-target="#myCarousel" data-slide-to="1"></li>
	</ol>

	<div class="carousel-inner" role="listbox">
		<div class="item active">
			<img src="http://www.smallbusinessdoctors.com/wp-content/uploads/2015/09/business-consulting2.jpg" class="first-slide" alt="Carts">
		</div>

		<div class="item">
			<img src="http://betaland.hu/wp-content/uploads/kapcsolat2.jpg" class="second-slide" alt="Users">
		</div>

	</div>


	<a class="left carousel-control" href="#myCarousel" role="button"
		data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"
		aria-hidden="true"></span> <span class="sr-only">Previous</span>
	</a> <a class="right carousel-control" href="#myCarousel" role="button"
		data-slide="next"> <span class="glyphicon glyphicon-chevron-right"
		aria-hidden="true"></span> <span class="sr-only">Next</span>
	</a>
</div>