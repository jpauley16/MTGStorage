<div class="container">
    <div class="col-md-12">
        <h2 id="pageHeader">Search for Card</h2>
    </div>
    <div class="col-md-6">
        <p id="userDisplayName">${user}</p>
    </div>
</div>


<div class="container">
    <form id="searchLibraryForm" action="/search-card-servlet" method="GET">
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
        <div class="col-md-6">

            <ul>
                <li>${card.name}</li>
                <li>${card.manaCost}</li>
                <li>${card.superType}</li>
                <li>${card.subType}</li>
                <li>${card.cardType}</li>
                <li>${card.rarity}</li>
                <li>${card.power}</li>
                <li>${card.toughness}</li>
                <li>${card.color}</li>
                <li>${card.qty}</li>
            </ul>

        </div>
    </div>
</div>


