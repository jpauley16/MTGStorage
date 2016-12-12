<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container">
    <div class="row">
        <div class="col-md-12">
            <p id="userDisplayName"><Strong>${user}</Strong></p>
        </div>
    </div>
    <div class="row">
        <div class="col-md-6">
            <h2>Add/Update Card</h2>
        </div>
        <div class="col-md-6">
            <c:if test="${cardAddMessage != null}">
                <h2 id="cardMessage"><Strong>${cardAddMessage}</Strong></h2>
            </c:if>
            <c:if test="${cardUpdateMessage != null}">
                <h2 id="cardMessage"><Strong>${cardUpdateMessage}</Strong></h2>
            </c:if>
        </div>
    </div>
</div>

<div class="container">
    <form id="searchLibraryForm" action="${root}/card-add-servlet" method="POST">
        <div class="row">
            <div class="col-md-4">
                <div class="form-group">
                    <label for="name">Card Name</label>
                    <input type="text" class="form-control" name="name" id="name" placeholder="Enter Card Name">
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4">
                <div class="form-group">
                    <label for="cost">Mana Cost</label>
                    <input type="text" class="form-control" name="cost" id="cost" placeholder="Mana Cost">
                    <small id="costHelp" class="form-text text-muted">Bl=Black, B=Blue, R=Red, W=White, G=Green, C=Colorless, X=X</small>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4">
                <div class="form-group">
                    <label for="superType">Select Super-Type</label>
                    <select class="form-control" name="superType" id="superType">
                        <option>Choose One..</option>
                        <option></option>
                        <option>Basic</option>
                        <option>Legendary</option>
                        <option>Ongoing</option>
                        <option>Plane</option>
                        <option>Planeswalker</option>
                        <option>Snow</option>
                        <option>World</option>
                    </select>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4">
                <div class="form-group">
                    <label for="subType">Select Sub-Type</label>
                    <select class="form-control" name="subType" id="subType">
                        <option>Choose One..</option>
                        <option></option>
                        <option>Advisor</option>
                        <option>Aetherborn</option>
                        <option>Ajani</option>
                        <option>Alara</option>
                        <option>Ally</option>
                        <option>Angel</option>
                        <option>Antelope</option>
                        <option>Ape</option>
                        <option>Arcane</option>
                        <option>Archer</option>
                        <option>Archon</option>
                        <option>Arkhos</option>
                        <option>Arlinn</option>
                        <option>Artificer</option>
                        <option>Ashiok</option>
                        <option>Assassin</option>
                        <option>Assembly-Worker</option>
                        <option>Atog</option>
                        <option>Aura</option>
                        <option>Aurochs</option>
                        <option>Avatar</option>
                        <option>Azgol</option>
                        <option>Badger</option>
                        <option>Barbarian</option>
                        <option>Basilisk</option>
                        <option>Bat</option>
                        <option>Bear</option>
                        <option>Beast</option>
                        <option>Beeble</option>
                        <option>Belenon</option>
                        <option>Berserker</option>
                        <option>Bird</option>
                        <option>Boar</option>
                        <option>Bolas</option>
                        <option>Bolas’s Meditation Realm</option>
                        <option>Bringer</option>
                        <option>Brushwagg</option>
                        <option>Camel</option>
                        <option>Carrier</option>
                        <option>Cat</option>
                        <option>Centaur</option>
                        <option>Cephalid</option>
                        <option>Chandra</option>
                        <option>Chicken</option>
                        <option>Chimera</option>
                        <option>Cleric</option>
                        <option>Cockatrice</option>
                        <option>Construct</option>
                        <option>Crab</option>
                        <option>Crocodile</option>
                        <option>Curse</option>
                        <option>Cyclops</option>
                        <option>Dack</option>
                        <option>Daretti</option>
                        <option>Dauthi</option>
                        <option>Demon</option>
                        <option>Desert</option>
                        <option>Devil</option>
                        <option>Djinn</option>
                        <option>Dominaria</option>
                        <option>Domri</option>
                        <option>Dovin</option>
                        <option>Dragon</option>
                        <option>Drake</option>
                        <option>Dreadnought</option>
                        <option>Drone</option>
                        <option>Druid</option>
                        <option>Dryad</option>
                        <option>Dwarf</option>
                        <option>Efreet</option>
                        <option>Elder</option>
                        <option>Eldrazi</option>
                        <option>Elemental</option>
                        <option>Elephant</option>
                        <option>Elf</option>
                        <option>Elk</option>
                        <option>Elspeth</option>
                        <option>Equilor</option>
                        <option>Equipment</option>
                        <option>Ergamon</option>
                        <option>Eye</option>
                        <option>Fabacin</option>
                        <option>Faerie</option>
                        <option>Ferret</option>
                        <option>Fish</option>
                        <option>Flagbearer</option>
                        <option>Forest</option>
                        <option>Fortification</option>
                        <option>Fox</option>
                        <option>Freyalise</option>
                        <option>Frog</option>
                        <option>Fungus</option>
                        <option>Gargoyle</option>
                        <option>Garruk</option>
                        <option>Gate</option>
                        <option>Giant</option>
                        <option>Gideon</option>
                        <option>Gnome</option>
                        <option>Goat</option>
                        <option>Goblin</option>
                        <option>God</option>
                        <option>Golem</option>
                        <option>Gorgon</option>
                        <option>Gremlin</option>
                        <option>Griffin</option>
                        <option>Hag</option>
                        <option>Harpy</option>
                        <option>Hellion</option>
                        <option>Hippo</option>
                        <option>Hippogriff</option>
                        <option>Homarid</option>
                        <option>Homunculus</option>
                        <option>Horror</option>
                        <option>Horse</option>
                        <option>Hound</option>
                        <option>Human</option>
                        <option>Hydra</option>
                        <option>Hyena</option>
                        <option>Illusion</option>
                        <option>Imp</option>
                        <option>Incarnation</option>
                        <option>Innistrad</option>
                        <option>Insect</option>
                        <option>Iquatana</option>
                        <option>Ir</option>
                        <option>Island</option>
                        <option>Jace</option>
                        <option>Jellyfish</option>
                        <option>Juggernaut</option>
                        <option>Kaldheim</option>
                        <option>Kamigawa</option>
                        <option>Karn</option>
                        <option>Kavu</option>
                        <option>Kaya</option>
                        <option>Kephalai</option>
                        <option>Kiora</option>
                        <option>Kirin</option>
                        <option>Kithkin</option>
                        <option>Knight</option>
                        <option>Kobold</option>
                        <option>Kolbahan</option>
                        <option>Kor</option>
                        <option>Koth</option>
                        <option>Kraken</option>
                        <option>Kyneth</option>
                        <option>Lair</option>
                        <option>Lamia</option>
                        <option>Lammasu</option>
                        <option>Leech</option>
                        <option>Legend</option>
                        <option>Leviathan</option>
                        <option>Lhurgoyf</option>
                        <option>Licid</option>
                        <option>Liliana</option>
                        <option>Lizard</option>
                        <option>Locus</option>
                        <option>Lorwyn</option>
                        <option>Manticore</option>
                        <option>Masticore</option>
                        <option>Mercadia</option>
                        <option>Mercenary</option>
                        <option>Merfolk</option>
                        <option>Metathran</option>
                        <option>Mine</option>
                        <option>Minion</option>
                        <option>Minotaur</option>
                        <option>Mirrodin</option>
                        <option>Moag</option>
                        <option>Mole</option>
                        <option>Monger</option>
                        <option>Mongoose</option>
                        <option>Mongseng</option>
                        <option>Monk</option>
                        <option>Monkey</option>
                        <option>Moonfolk</option>
                        <option>Mountain</option>
                        <option>Muraganda</option>
                        <option>Mutant</option>
                        <option>Myr</option>
                        <option>Mystic</option>
                        <option>Naga</option>
                        <option>Nahiri</option>
                        <option>Narset</option>
                        <option>Nautilus</option>
                        <option>Nephilim</option>
                        <option>New Phyrexia</option>
                        <option>Nightmare</option>
                        <option>Nightstalker</option>
                        <option>Ninja</option>
                        <option>Nissa</option>
                        <option>Nixilis</option>
                        <option>Noggle</option>
                        <option>Nomad</option>
                        <option>Nymph</option>
                        <option>Octopus</option>
                        <option>Ogre</option>
                        <option>Ooze</option>
                        <option>Orc</option>
                        <option>Orgg</option>
                        <option>Ouphe</option>
                        <option>Ox</option>
                        <option>Oyster</option>
                        <option>Pegasus</option>
                        <option>Pest</option>
                        <option>Phelddagrif</option>
                        <option>Phoenix</option>
                        <option>Phyrexia</option>
                        <option>Pilot</option>
                        <option>Pirate</option>
                        <option>Plains</option>
                        <option>Plant</option>
                        <option>Power-Plant</option>
                        <option>Praetor</option>
                        <option>Processor</option>
                        <option>Rabbit</option>
                        <option>Rabiah</option>
                        <option>Ral</option>
                        <option>Rat</option>
                        <option>Rath</option>
                        <option>Ravnica</option>
                        <option>Rebel</option>
                        <option>Reflection</option>
                        <option>Regatha</option>
                        <option>Rhino</option>
                        <option>Rigger</option>
                        <option>Rogue</option>
                        <option>Sable</option>
                        <option>Saheeli</option>
                        <option>Salamander</option>
                        <option>Samurai</option>
                        <option>Saproling</option>
                        <option>Sarkhan</option>
                        <option>Satyr</option>
                        <option>Scarecrow</option>
                        <option>Scion</option>
                        <option>Scorpion</option>
                        <option>Scout</option>
                        <option>Segovia</option>
                        <option>Serpent</option>
                        <option>Serra’s Realm</option>
                        <option>Shade</option>
                        <option>Shadowmoor</option>
                        <option>Shaman</option>
                        <option>Shandalar</option>
                        <option>Shapeshifter</option>
                        <option>Sheep</option>
                        <option>Shrine</option>
                        <option>Siren</option>
                        <option>Skeleton</option>
                        <option>Slith</option>
                        <option>Sliver</option>
                        <option>Slug</option>
                        <option>Snake</option>
                        <option>Soldier</option>
                        <option>Soltari</option>
                        <option>Sorin</option>
                        <option>Spawn</option>
                        <option>Specter</option>
                        <option>Spellshaper</option>
                        <option>Sphinx</option>
                        <option>Spider</option>
                        <option>Spike</option>
                        <option>Spirit</option>
                        <option>Sponge</option>
                        <option>Squid</option>
                        <option>Squirrel</option>
                        <option>Starfish</option>
                        <option>Surrakar</option>
                        <option>Swamp</option>
                        <option>Tamiyo</option>
                        <option>Teferi</option>
                        <option>Tezzeret</option>
                        <option>Thalakos</option>
                        <option>Thopter</option>
                        <option>Thrull</option>
                        <option>Tibalt</option>
                        <option>Tower</option>
                        <option>Trap</option>
                        <option>Treefolk</option>
                        <option>Troll</option>
                        <option>Turtle</option>
                        <option>Ugin</option>
                        <option>Ulgrotha</option>
                        <option>Unicorn</option>
                        <option>Urza’s</option>
                        <option>Valla</option>
                        <option>Vampire</option>
                        <option>Vedalken</option>
                        <option>Vehicle</option>
                        <option>Venser</option>
                        <option>Viashino</option>
                        <option>Volver</option>
                        <option>Vraska</option>
                        <option>Vryn</option>
                        <option>Wall</option>
                        <option>Warrior</option>
                        <option>Weird</option>
                        <option>Werewolf</option>
                        <option>Whale</option>
                        <option>Wildfire</option>
                        <option>Wizard</option>
                        <option>Wolf</option>
                        <option>Wolverine</option>
                        <option>Wombat</option>
                        <option>Worm</option>
                        <option>Wraith</option>
                        <option>Wurm</option>
                        <option>Xenagos</option>
                        <option>Xerex</option>
                        <option>Yeti</option>
                        <option>Zendikar</option>
                        <option>Zombie</option>
                        <option>Zubera</option>
                    </select>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4">
                <div class="form-group">
                    <label for="cardType">Card Type</label>
                    <select class="form-control" name="cardType" id="cardType">
                        <option>Choose One..</option>
                        <option></option>
                        <option>Artifact</option>
                        <option>Conspiracy</option>
                        <option>Creature</option>
                        <option>Enchantment</option>
                        <option>Instant</option>
                        <option>Land</option>
                        <option>Phenomenon</option>
                        <option>Plane</option>
                        <option>Planeswalker</option>
                        <option>Scheme</option>
                        <option>Sorcery</option>
                        <option>Tribal</option>
                        <option>Vanguard</option>
                    </select>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4">
                <div class="form-group">
                    <label for="rarity">Rarity</label>
                    <select class="form-control" name="rarity" id="rarity">
                        <option>Choose One..</option>
                        <option>Common</option>
                        <option>Uncommon</option>
                        <option>Rare</option>
                        <option>Mythic</option>
                    </select>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4">
                <div class="form-group">
                    <label for="power">Power</label>
                    <input type="text" class="form-control" name="power" id="power">
                    <small id="powerHelp" class="form-text text-muted">If power is represented by X, please enter X.</small>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4">
                <div class="form-group">
                    <label for="toughness">Toughness</label>
                    <input type="text" class="form-control" name="toughness" id="toughness">
                    <small id="toughnessHelp" class="form-text text-muted">If toughness is represented by X, please enter X.</small>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4">
                <div class="form-group">
                    <label for="color">Color</label>
                    <select class="form-control" name="color" id="color">
                        <option>Choose One..</option>
                        <option>Black</option>
                        <option>Blue</option>
                        <option>Colorless</option>
                        <option>Green</option>
                        <option>Mulitcolored</option>
                        <option>Red</option>
                        <option>White</option>
                    </select>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4">
                <div class="form-group">
                    <label for="quantity">Qty</label>
                    <input type="text" class="form-control" name="quantity" id="quantity">
                </div>
            </div>
        </div>


        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>