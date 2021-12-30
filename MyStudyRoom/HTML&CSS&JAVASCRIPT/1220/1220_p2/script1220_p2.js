const fileInput = document.getElementById('file-input')
const imgBox = document.getElementById('img-box')
const parent = document.getElementById('parent')



function openFileWindow(e){
    const target = e.target
    target.classList.add('parent')
    fileInput.click()
}



function isValid(type){
    return type.split('/')[0] === 'image'
}

function displayImg(e){
    console.log(e.target.files)
    fileInput.remove.classList('show')
    
    const file = e.target.files[0]

    if(!isValid(file.type)){
        imgBox.innerHTML = 'File type is not valid !'
        return;
    }
    const img = document.createElement('img')
    img.src = URL.createObjectURL(file)
    imgBox.appendChild(img)
}

parent.addEventListener('click', openFileWindow)
fileInput.addEventListener('change', displayImg)