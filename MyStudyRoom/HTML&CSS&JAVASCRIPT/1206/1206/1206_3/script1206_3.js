const menuContainer = document.getElementById('menu-container')


function openMenu(e){
    const target = e.target
    console.log(target)

    if(target.className === 'title'){
        console.log(target)
        target.nextElementSibling.classList.toggle('open')
    }
    target.closeMenu()
}

menuContainer.addEventListener('click', openMenu)