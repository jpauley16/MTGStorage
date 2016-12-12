<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<br /><br />
<div class="container">
    <form id="searchMTGForm" action="${root}/search-mtg-servlet" method="GET">
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
<br />
<c:if test="${cardDetailError != null}">
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <h2>${cardDetailError}</h2>
        </div>
    </div>
</div>
</c:if>
<c:if test="${cardDetail != null}">
<div class="container">
    <div class="row">
        <div class="col-md-12">
                <Strong><p>Card name: </Strong>${cardDetail.name}</p>
                <Strong><p>Mana Cost: </Strong>${cardDetail.cost}</p>
                <Strong><p>Types: </Strong>${cardDetail.types}</p>
                <Strong><p>Subtype: </Strong>${cardDetail.subtypes}</p>
                <Strong><p>Color(s): </Strong>${cardDetail.colors}</p>
                <Strong><p>Description: </Strong>${cardDetail.text}</p>
                <Strong><p>Power: </Strong>${cardDetail.power}</p>
                <Strong><p>Toughness: </Strong>${cardDetail.toughness}</p>
                <Strong><p>Loyalty: </Strong>${cardDetail.loyalty}</p>
                <Strong><p>Formats: </Strong></p>
                <ul>
                    <Strong>Commander: </Strong><li>${cardDetail.formats.commander}</li>
                    <Strong>Legacy: </Strong><li>${cardDetail.formats.legacy}</li>
                    <Strong>Vintage: </Strong><li>${cardDetail.formats.vintage}</li>
                    <Strong>Modern: </Strong><li>${cardDetail.formats.modern}</li>
                </ul>
                <Strong><p>Buy at url: </Strong>${cardDetail.storeUrl}</p>
        </div>
    </div>
</div>
</c:if>