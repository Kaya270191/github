function buildElement(dataa){
    const div = document.createElement('div')

    const title = document.createElement('div')
    title.className = 'title'
    title.innerHTML = `${dataa.title}`

    const bundesland = document.createElement('div')
    bundesland.className = 'bundesland'
    bundesland.innerHTML = `${dataa.bundesland}`
    

    const ort = document.createElement('div')
    ort.className = 'ort'
    ort.innerHTML = `${dataa.ort}`

    div.append(title,bundesland, ort)
    return div
    // console.log(div)
}

function displayProduct(div){
    const root = document.getElementById('root')
    // console.log(div)
    root.append(div)
}

fetch("https://beer-live.p.rapidapi.com/brews", {
	"method": "GET",
	"headers": {
		"x-rapidapi-host": "beer-live.p.rapidapi.com",
		"x-rapidapi-key": "3967903a95msh4a75498ba422a07p12f324jsn284c86d764d1"
	}
})
.then(response => {
	// console.log(response);
    return response.json()
})
.then(data=>{
    console.log(data)

    const dataRefined = data.map(buildElement)
    // console.log(dataRefined)
    dataRefined.forEach(displayProduct)

})
.catch(err => {
	console.error(err);
});





