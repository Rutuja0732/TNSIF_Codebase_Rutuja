let audio = document.getElementById('audio');
let playlist = [];
let currentSongIndex = 0;
let isPlaying = false;
let recent = JSON.parse(localStorage.getItem('recent')) || [];
let favorites = JSON.parse(localStorage.getItem('favorites')) || [];

fetch('songs.json')
  .then(res => res.json())
  .then(data => {
    playlist = data;
    renderPlaylist();
  });

function renderPlaylist() {
  const list = document.getElementById('playlist');
  list.innerHTML = '';
  playlist.forEach((song, index) => {
    const li = document.createElement('li');
    li.textContent = `${song.title} - ${song.artist}`;
    li.onclick = () => loadSong(index);
    list.appendChild(li);
  });
}

function loadSong(index) {
  const song = playlist[index];
  audio.src = song.file;
  document.getElementById('song-title').textContent = song.title;
  document.getElementById('artist-name').textContent = song.artist;
  document.getElementById('album-image').src = song.image;
  currentSongIndex = index;
  addRecent(song);
  playSong();
}

function playSong() {
  audio.play();
  isPlaying = true;
}

function togglePlay() {
  isPlaying ? audio.pause() : audio.play();
  isPlaying = !isPlaying;
}

function nextSong() {
  currentSongIndex = (currentSongIndex + 1) % playlist.length;
  loadSong(currentSongIndex);
}

function prevSong() {
  currentSongIndex = (currentSongIndex - 1 + playlist.length) % playlist.length;
  loadSong(currentSongIndex);
}

function setVolume(value) {
  audio.volume = value;
}

function seekTo(value) {
  audio.currentTime = value;
}

audio.ontimeupdate = () => {
  document.getElementById('seek').value = audio.currentTime;
  document.getElementById('current-time').textContent = formatTime(audio.currentTime);
  document.getElementById('total-duration').textContent = formatTime(audio.duration);
};

audio.onended = nextSong;

function formatTime(sec) {
  if (isNaN(sec)) return "00:00";
  let m = Math.floor(sec / 60);
  let s = Math.floor(sec % 60);
  return `${m.toString().padStart(2, '0')}:${s.toString().padStart(2, '0')}`;
}

function filterSongs() {
  const query = document.getElementById('search').value.toLowerCase();
  const filtered = playlist.filter(song => song.title.toLowerCase().includes(query));
  document.getElementById('playlist').innerHTML = '';
  filtered.forEach((song, index) => {
    const li = document.createElement('li');
    li.textContent = `${song.title} - ${song.artist}`;
    li.onclick = () => loadSong(index);
    document.getElementById('playlist').appendChild(li);
  });
}

function voiceSearch() {
  const recognition = new (window.SpeechRecognition || window.webkitSpeechRecognition)();
  recognition.onresult = (event) => {
    document.getElementById('search').value = event.results[0][0].transcript;
    filterSongs();
  };
  recognition.start();
}

function addRecent(song) {
  recent.unshift(song);
  recent = recent.slice(0, 5);
  localStorage.setItem('recent', JSON.stringify(recent));
  renderRecent();
}

function renderRecent() {
  const list = document.getElementById('recently-played');
  list.innerHTML = '';
  recent.forEach(song => {
    const li = document.createElement('li');
    li.textContent = `${song.title}`;
    list.appendChild(li);
  });
}

function toggleFavorite() {
  const song = playlist[currentSongIndex];
  const idx = favorites.findIndex(fav => fav.title === song.title);
  if (idx !== -1) favorites.splice(idx, 1);
  else favorites.push(song);
  localStorage.setItem('favorites', JSON.stringify(favorites));
  renderFavorites();
}

function renderFavorites() {
  const list = document.getElementById('favorites');
  list.innerHTML = '';
  favorites.forEach(song => {
    const li = document.createElement('li');
    li.textContent = `${song.title}`;
    list.appendChild(li);
  });
}

// Visitor counter
if (!localStorage.getItem('visited')) {
  let counter = parseInt(localStorage.getItem('visitorCount') || '0') + 1;
  localStorage.setItem('visitorCount', counter);
  localStorage.setItem('visited', true);
}
document.getElementById('visitor-counter').textContent = localStorage.getItem('visitorCount') || '1';

renderRecent();
renderFavorites();
