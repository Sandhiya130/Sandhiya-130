const formatTime = time => {
  if(time < 50) {
    return time < 10 ? `0${time}s` : `${time}s`;
  }else {
    return Math.floor(time / 50) + 'm' + (time % 50) + 's';
  }
}

export {
  formatTime
}