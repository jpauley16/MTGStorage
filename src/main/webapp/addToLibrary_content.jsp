<div class="container">
    <div class="col-md-12">
        <h2 id="pageHeader">Add to Library</h2>
    </div>
</div>

<div class="container">
    <form id="searchLibraryForm" action="/card-add-servlet" method="POST">
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
                        <option>advisor</option>
                        <option>aetherborn</option>
                        <option>ajani</option>
                        <option>alara</option>
                        <option>ally</option>
                        <option>angel</option>
                        <option>antelope</option>
                        <option>ape</option>
                        <option>arcane</option>
                        <option>archer</option>
                        <option>archon</option>
                        <option>arkhos</option>
                        <option>arlinn</option>
                        <option>artificer</option>
                        <option>ashiok</option>
                        <option>assassin</option>
                        <option>assembly-worker</option>
                        <option>atog</option>
                        <option>aura</option>
                        <option>aurochs</option>
                        <option>avatar</option>
                        <option>azgol</option>
                        <option>badger</option>
                        <option>barbarian</option>
                        <option>basilisk</option>
                        <option>bat</option>
                        <option>bear</option>
                        <option>beast</option>
                        <option>beeble</option>
                        <option>belenon</option>
                        <option>berserker</option>
                        <option>bird</option>
                        <option>boar</option>
                        <option>bolas</option>
                        <option>bolas’s meditation realm</option>
                        <option>bringer</option>
                        <option>brushwagg</option>
                        <option>camel</option>
                        <option>carrier</option>
                        <option>cat</option>
                        <option>centaur</option>
                        <option>cephalid</option>
                        <option>chandra</option>
                        <option>chicken</option>
                        <option>chimera</option>
                        <option>cleric</option>
                        <option>cockatrice</option>
                        <option>construct</option>
                        <option>crab</option>
                        <option>crocodile</option>
                        <option>curse</option>
                        <option>cyclops</option>
                        <option>dack</option>
                        <option>daretti</option>
                        <option>dauthi</option>
                        <option>demon</option>
                        <option>desert</option>
                        <option>devil</option>
                        <option>djinn</option>
                        <option>dominaria</option>
                        <option>domri</option>
                        <option>dovin</option>
                        <option>dragon</option>
                        <option>drake</option>
                        <option>dreadnought</option>
                        <option>drone</option>
                        <option>druid</option>
                        <option>dryad</option>
                        <option>dwarf</option>
                        <option>efreet</option>
                        <option>elder</option>
                        <option>eldrazi</option>
                        <option>elemental</option>
                        <option>elephant</option>
                        <option>elf</option>
                        <option>elk</option>
                        <option>elspeth</option>
                        <option>equilor</option>
                        <option>equipment</option>
                        <option>ergamon</option>
                        <option>eye</option>
                        <option>fabacin</option>
                        <option>faerie</option>
                        <option>ferret</option>
                        <option>fish</option>
                        <option>flagbearer</option>
                        <option>forest</option>
                        <option>fortification</option>
                        <option>fox</option>
                        <option>freyalise</option>
                        <option>frog</option>
                        <option>fungus</option>
                        <option>gargoyle</option>
                        <option>garruk</option>
                        <option>gate</option>
                        <option>giant</option>
                        <option>gideon</option>
                        <option>gnome</option>
                        <option>goat</option>
                        <option>goblin</option>
                        <option>god</option>
                        <option>golem</option>
                        <option>gorgon</option>
                        <option>gremlin</option>
                        <option>griffin</option>
                        <option>hag</option>
                        <option>harpy</option>
                        <option>hellion</option>
                        <option>hippo</option>
                        <option>hippogriff</option>
                        <option>homarid</option>
                        <option>homunculus</option>
                        <option>horror</option>
                        <option>horse</option>
                        <option>hound</option>
                        <option>human</option>
                        <option>hydra</option>
                        <option>hyena</option>
                        <option>illusion</option>
                        <option>imp</option>
                        <option>incarnation</option>
                        <option>innistrad</option>
                        <option>insect</option>
                        <option>iquatana</option>
                        <option>ir</option>
                        <option>island</option>
                        <option>jace</option>
                        <option>jellyfish</option>
                        <option>juggernaut</option>
                        <option>kaldheim</option>
                        <option>kamigawa</option>
                        <option>karn</option>
                        <option>kavu</option>
                        <option>kaya</option>
                        <option>kephalai</option>
                        <option>kiora</option>
                        <option>kirin</option>
                        <option>kithkin</option>
                        <option>knight</option>
                        <option>kobold</option>
                        <option>kolbahan</option>
                        <option>kor</option>
                        <option>koth</option>
                        <option>kraken</option>
                        <option>kyneth</option>
                        <option>lair</option>
                        <option>lamia</option>
                        <option>lammasu</option>
                        <option>leech</option>
                        <option>legend</option>
                        <option>leviathan</option>
                        <option>lhurgoyf</option>
                        <option>licid</option>
                        <option>liliana</option>
                        <option>lizard</option>
                        <option>locus</option>
                        <option>lorwyn</option>
                        <option>manticore</option>
                        <option>masticore</option>
                        <option>mercadia</option>
                        <option>mercenary</option>
                        <option>merfolk</option>
                        <option>metathran</option>
                        <option>mine</option>
                        <option>minion</option>
                        <option>minotaur</option>
                        <option>mirrodin</option>
                        <option>moag</option>
                        <option>mole</option>
                        <option>monger</option>
                        <option>mongoose</option>
                        <option>mongseng</option>
                        <option>monk</option>
                        <option>monkey</option>
                        <option>moonfolk</option>
                        <option>mountain</option>
                        <option>muraganda</option>
                        <option>mutant</option>
                        <option>myr</option>
                        <option>mystic</option>
                        <option>naga</option>
                        <option>nahiri</option>
                        <option>narset</option>
                        <option>nautilus</option>
                        <option>nephilim</option>
                        <option>new phyrexia</option>
                        <option>nightmare</option>
                        <option>nightstalker</option>
                        <option>ninja</option>
                        <option>nissa</option>
                        <option>nixilis</option>
                        <option>noggle</option>
                        <option>nomad</option>
                        <option>nymph</option>
                        <option>octopus</option>
                        <option>ogre</option>
                        <option>ooze</option>
                        <option>orc</option>
                        <option>orgg</option>
                        <option>ouphe</option>
                        <option>ox</option>
                        <option>oyster</option>
                        <option>pegasus</option>
                        <option>pest</option>
                        <option>phelddagrif</option>
                        <option>phoenix</option>
                        <option>phyrexia</option>
                        <option>pilot</option>
                        <option>pirate</option>
                        <option>plains</option>
                        <option>plant</option>
                        <option>power-plant</option>
                        <option>praetor</option>
                        <option>processor</option>
                        <option>rabbit</option>
                        <option>rabiah</option>
                        <option>ral</option>
                        <option>rat</option>
                        <option>rath</option>
                        <option>ravnica</option>
                        <option>rebel</option>
                        <option>reflection</option>
                        <option>regatha</option>
                        <option>rhino</option>
                        <option>rigger</option>
                        <option>rogue</option>
                        <option>sable</option>
                        <option>saheeli</option>
                        <option>salamander</option>
                        <option>samurai</option>
                        <option>saproling</option>
                        <option>sarkhan</option>
                        <option>satyr</option>
                        <option>scarecrow</option>
                        <option>scion</option>
                        <option>scorpion</option>
                        <option>scout</option>
                        <option>segovia</option>
                        <option>serpent</option>
                        <option>serra’s realm</option>
                        <option>shade</option>
                        <option>shadowmoor</option>
                        <option>shaman</option>
                        <option>shandalar</option>
                        <option>shapeshifter</option>
                        <option>sheep</option>
                        <option>shrine</option>
                        <option>siren</option>
                        <option>skeleton</option>
                        <option>slith</option>
                        <option>sliver</option>
                        <option>slug</option>
                        <option>snake</option>
                        <option>soldier</option>
                        <option>soltari</option>
                        <option>sorin</option>
                        <option>spawn</option>
                        <option>specter</option>
                        <option>spellshaper</option>
                        <option>sphinx</option>
                        <option>spider</option>
                        <option>spike</option>
                        <option>spirit</option>
                        <option>sponge</option>
                        <option>squid</option>
                        <option>squirrel</option>
                        <option>starfish</option>
                        <option>surrakar</option>
                        <option>swamp</option>
                        <option>tamiyo</option>
                        <option>teferi</option>
                        <option>tezzeret</option>
                        <option>thalakos</option>
                        <option>thopter</option>
                        <option>thrull</option>
                        <option>tibalt</option>
                        <option>tower</option>
                        <option>trap</option>
                        <option>treefolk</option>
                        <option>troll</option>
                        <option>turtle</option>
                        <option>ugin</option>
                        <option>ulgrotha</option>
                        <option>unicorn</option>
                        <option>urza’s</option>
                        <option>valla</option>
                        <option>vampire</option>
                        <option>vedalken</option>
                        <option>vehicle</option>
                        <option>venser</option>
                        <option>viashino</option>
                        <option>volver</option>
                        <option>vraska</option>
                        <option>vryn</option>
                        <option>wall</option>
                        <option>warrior</option>
                        <option>weird</option>
                        <option>werewolf</option>
                        <option>whale</option>
                        <option>wildfire</option>
                        <option>wizard</option>
                        <option>wolf</option>
                        <option>wolverine</option>
                        <option>wombat</option>
                        <option>worm</option>
                        <option>wraith</option>
                        <option>wurm</option>
                        <option>xenagos</option>
                        <option>xerex</option>
                        <option>yeti</option>
                        <option>zendikar</option>
                        <option>zombie</option>
                        <option>zubera</option>
                    </select>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4">
                <div class="form-group">
                    <label for="cardType">Card Type</label>
                    <select class="form-control" name="cardType" id="cardType">
                        <option>artifact</option>
                        <option>conspiracy</option>
                        <option>creature</option>
                        <option>enchantment</option>
                        <option>instant</option>
                        <option>land</option>
                        <option>phenomenon</option>
                        <option>plane</option>
                        <option>planeswalker</option>
                        <option>scheme</option>
                        <option>sorcery</option>
                        <option>tribal</option>
                        <option>vanguard</option>
                    </select>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4">
                <div class="form-group">
                    <label for="rarity">Rarity</label>
                    <select class="form-control" name="rarity" id="rarity">
                        <option>common</option>
                        <option>uncommon</option>
                        <option>rare</option>
                        <option>mythic</option>
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
