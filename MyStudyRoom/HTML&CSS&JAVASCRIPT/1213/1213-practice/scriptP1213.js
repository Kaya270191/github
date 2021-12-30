const clock = document.getElementById('clock')

function changeFormat(t){
    return t < 10 ? `0${t}` : t //t가 0보다 작으면 t앞에0붙이기 아니면 그냥
}
function getTime(){
    const time = new Date()
    const hours = time.getHours()
    const minutes = time.getMinutes()
    const seconds = time.getSeconds()

    clock.innerText  = `${changeFormat(hours)}:${changeFormat(minutes)}:${changeFormat(seconds)}`
}

setInterval(getTime, 1000)