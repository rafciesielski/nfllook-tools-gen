var fs = require('fs');

var schedule = createWeekSchedule(createGame())

var path = __dirname + '\\src\\main\\resources\\' + 'week_schedule.json';
fs.writeFile(path, JSON.stringify(schedule, null, 2), function(err) {
    if (err) {
        return console.log(err);
    }
    console.log("Done: " + path);
});

function createGame() {
    game = {}
    game.home = 'DEN'
    game.away = 'CAR'
    game.dayOfTheWeek = 'Thu'
    game.time = '8:30'
    return game
}

function createWeekSchedule(game) {
    schedule = {}
    schedule._id = '2016_1'
    schedule.week = 1
    schedule.games = [game]
    return schedule
}