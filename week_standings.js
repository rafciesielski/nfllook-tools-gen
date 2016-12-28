var fs = require('fs');

var afcEast = createDivision("East", createTeam("BUF"), createTeam("MIA"),
    createTeam("NE"), createTeam("NYJ"))
var afcNorth = createDivision("North", createTeam("BAL"), createTeam("CIN"),
    createTeam("CLE"), createTeam("PIT"))
var afcSouth = createDivision("South", createTeam("HOU"), createTeam("IND"),
    createTeam("JAX"), createTeam("TEN"))
var afcWest = createDivision("West", createTeam("DEN"), createTeam("KC"),
    createTeam("OAK"), createTeam("SD"))
var afc = createConference("AFC", afcEast, afcNorth, afcSouth, afcWest)

var nfcEast = createDivision("East", createTeam("DAL"), createTeam("NYG"),
    createTeam("PHI"), createTeam("WAS"))
var nfcNorth = createDivision("North", createTeam("CHI"), createTeam("DET"),
    createTeam("GB"), createTeam("MIN"))
var nfcSouth = createDivision("South", createTeam("ATL"), createTeam("CAR"),
    createTeam("NO"), createTeam("TB"))
var nfcWest = createDivision("West", createTeam("ARI"), createTeam("LA"),
    createTeam("SF"), createTeam("SEA"))
var nfc = createConference("NFC", nfcEast, nfcNorth, nfcSouth, nfcWest)

var standings = createWeekStandings(afc, nfc)

var path = __dirname + '\\src\\main\\resources\\' + 'week_standings_bootstrap.json';
fs.writeFile(path, JSON.stringify(standings, null, 2), function(err) {
    if (err) {
        return console.log(err);
    }
    console.log("Done: " + path);
});

function createTeam(name) {
    team = {}
    team.name = name
    team.wins = 0
    team.losses = 0
    team.draws = 0
    team.winningPercentage = 0
    team.oppsOfPlayedGames = {}
    team.oppsOfPlayedGames.wins = 0
    team.oppsOfPlayedGames.losses = 0
    team.oppsOfPlayedGames.draws = 0
    team.oppsOfPlayedGames.winningPercentage = 0
    team.oppsOfRemainingGames = {}
    team.oppsOfRemainingGames.wins = 0
    team.oppsOfRemainingGames.losses = 0
    team.oppsOfRemainingGames.draws = 0
    team.oppsOfRemainingGames.winningPercentage = 0
    return team
}

function createDivision(name, team1, team2, team3, team4) {
    division = {}
    division.name = name
    division.teams = [team1, team2, team3, team4]
    return division
}

function createConference(name, division1, division2, division3, division4) {
    conference = {}
    conference.name = name
    conference.divisions = [division1, division2, division3, division4]
    return conference
}

function createWeekStandings(conference1, conference2) {
    standings = {}
    standings._id = '2016_0'
    standings.week = 0
    standings.uploadDate = new Date()
    standings.conferences = [conference1, conference2]
    return standings
}
