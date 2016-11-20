team1 = {}
team1.name = 'BAL'
team1.w = 2
team1.l = 1
team1.d = 0
team1.opp = {}
team1.opp.w = 4
team1.opp.l = 4
team1.opp.d = 1

division1 = {}
division1.name = 'North'
division1.teams = [team1]

conference1 = {}
conference1.name = 'AFC'
conference1.divisions = [division1]

week3 = {}
week3.week = 3
week3.conferences = [conference1]

var fs = require('fs');
var path = __dirname + '\\src\\main\\resources\\' + 'week_standings.json';
fs.writeFile(path, JSON.stringify(week3, null, 2), function(err) {
    if (err) {
        return console.log(err);
    }
    console.log("Done: " + path);
});
