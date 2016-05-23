var gulp = require('gulp');
var watch = require('gulp-watch');
var spawn = require('child_process').spawn;

gulp.task('default', function () {
  watch('./**/*.java', function (file) {
    var filename = file.basename.match(/(\S+)\.java/)[1];

    spawn('javac', [file.basename], { stdio: 'inherit' }).on('close', (code) => {
      if (code === 0) {
        spawn('java', [filename], { stdio: 'inherit' });
      }
    });
  });
});
