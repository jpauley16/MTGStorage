<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<c:set var="pageTitle" value="Search Library" scope="request" />
<c:set var="root" value="${pageContext.request.contextPath}" scope="request" />

<c:import url="index_head.jsp" />

<body>

<c:import url="index_header_links.jsp" />

<div class="container">
    <div class="col-md-6">
        <h2 id="pageHeader">Search for Card</h2>
    </div>
    <div class="col-md-6">
        <Strong><p id="userDisplayName">${user}</Strong</p>
    </div>
</div>


<div class="container">
    <form id="searchLibraryForm" action="${root}/search-card-servlet" method="GET">
        <div class="row">
            <div class="col-md-4">
                <div class="form-group">
                    <label for="name">Card Name</label>
                    <input type="text" class="form-control" id="name" name="name" placeholder="Enter Card Name">
                </div>
            </div>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>

<div class="container">
    <div class="row">
        <div class="col-md-10">
            <hr />
            <br/>
            <c:if test="${error != null}">
                <h2><strong>${error}</strong></h2>
            </c:if>
            <c:forEach var="card" items="${card}">

                    <p><strong>Card Name: </strong>${card.name}</p>
                    <c:if test="${card.manaCost != null}">
                        <p><strong>Mana Cost: </strong>${card.manaCost}</p>
                    </c:if>
                    <c:if test="${card.superType != 'Choose One..'}">
                        <p><strong>Super Type: </strong>${card.superType}</p>
                    </c:if>
                    <c:if test="${card.subType != 'Choose One..'}">
                        <p><strong>Sub Type: </strong>${card.subType}</p>
                    </c:if>
                    <c:if test="${card.cardType != 'Choose One..'}">
                        <p><strong>Card Type: </strong>${card.cardType}</p>
                    </c:if>
                    <p><strong>Rarity: </strong>${card.rarity}</p>
                    <c:if test="${card.power != ''}">
                        <p><strong>Power: </strong>${card.power}</p>
                    </c:if>
                    <c:if test="${card.toughness != ''}">
                        <p><strong>Toughness: </strong>${card.toughness}</p>
                    </c:if>
                    <c:if test="${card.color != 'Choose One..'}">
                        <p><strong>Color: </strong>${card.color}</p>
                    </c:if>
                    <p><strong>Quantity: </strong>${card.qty}</p>
            </c:forEach>

        </div>
    </div>
</div>

<c:import url="index_footer.jsp" />

</body>
</html>
