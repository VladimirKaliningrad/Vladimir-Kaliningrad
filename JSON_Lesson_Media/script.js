const videoBox = document.querySelector('.video');
const nowTime = document.querySelector('.now__time');
const timeRange = document.querySelector('.time_range');
const playButton = document.querySelector('.fa-play');
const stopButton = document.querySelector('.fa-pause');
const volumeLevel = document.querySelector('.volume_level');
const volumeRange = document.querySelector('.volume_range');

// console.dir(videoBox);
playButton.addEventListener('click', () => {
videoBox.play();
})
stopButton.addEventListener('click', () => {
videoBox.pause();
})

videoBox.addEventListener('timeupdate', () => {
const minutes = Math.floor(videoBox.currentTime/60);
const sec = Math.floor(videoBox.currentTime % 60);
nowTime.innerHTML = `${String(minutes).padStart(2,'0')}:${String(sec).padStart(2,'0')}`;
timeRange.value = videoBox.currentTime/videoBox.duration*100;
})

timeRange.addEventListener('input', () => {
videoBox.currentTime = timeRange.value/100*videoBox.duration;
})

volumeRange.addEventListener('input', () => {
const volume = volumeRange.value;
videoBox.volume = volume;
volumeLevel.innerHTML = Math.round(volume*10);
})