<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <p id="userDisplayName"><Strong>${user}</Strong></p>
        </div>
    </div>
    <div class="row">
        <div class="col-md-6">
            <h2>Remove Card</h2>
        </div>
    <c:if test="${deleteMessage != null}">
        <div class="col-md-6">
            <h2 id="deleteMessage"><Strong>${deleteMessage}</Strong></h2>
        </div>
    </c:if>
    </div>
</div>

<div class="container">
    <table style="width:40%">
        <tr>
            <th>Delete</th>
            <th>Card Name</th>
            <th>Quantity</th>
        </tr>

    <c:forEach var="cards" items="${cards}">
        <tr>
            <td><a href="display_remove?card=${cards.cardKey}">Remove</a></td>
            <td>${cards.name}</td>
            <td>${cards.qty}</td>
        </tr>
    </c:forEach>
    </table>

</div>
