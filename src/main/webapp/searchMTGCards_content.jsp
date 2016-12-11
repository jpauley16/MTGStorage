<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<br /><br />
<div class="container">
    <form id="searchMTGForm" action="/search-mtg-servlet" method="GET">
        <div class="row">
            <div class="col-md-12">
                <div class="form-group">
                    <label for="name">Search all MTG by card name</label>
                    <input type="text" class="form-control" id="name" name="name" placeholder="Enter Card Name">
                </div>
            </div>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>

<div class="container">
    <div class="row">
        <div class="col-md-12">
            <c:if test="${cardSearched != null}">
                <p>${cardSearched}</p>
            </c:if>
        </div>
    </div>
</div>
