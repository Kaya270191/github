//* 연습과제 12
//연습과제 6번에 사용한 OPEN API 데이터를 사용하여 웹 화면에 아래와 같이 출력해보자! 
const API_URL = 'http://makeup-api.herokuapp.com/api/v1/products.json?brand=maybelline' 

// 상품 정보에 대한 배열로부터 웹화면에 보여줄 DOM 객체로 이루어진 배열로 변환하기
// product 객체의 image_link, name, price, description 프로퍼티 사용하기
function buildElement(product){
    // 구현하기
    
    // const productDiv = document.createElement('div')
    // productDiv.className = 'product'

    // const product_img = document.createElement('div')
    // product_img.className = 'product-img'

    // const product_img_img = document.createElement('img')
    // product_img_img.src = `${product.image_link}`

    // product_img.append(product_img_img)


    // const product_name = document.createElement('div')
    // product_name.className = 'product-name'
    // product_name.innerHTML = `${product.name} ${product.price}`

    // const product_description = document.createElement('div')
    // product_description.className = 'product-description'
    // product_description.innerHTML = `${product.description}`

    // productDiv.append(product_img, product_name, product_description)

    // return productDiv


    //교수님 답
    const item = document.createElement('div')
    item.className = 'product'
    item.innerHTML =`
        <div class ='product-img'><img src=${product.image_link} alt=${product.name}/></div>
        <div class ='product-name'>${product.name} (${product.price})</div>
        <div class = 'product-desciption'>${product.description}</div>`
        return item

}

// DOM 객체로 이루어진 배열을 사용하여 웹 화면에 상품 정보 보여주기
function displayProduct(product){
   root.append(product)
}

fetch(API_URL)
.then(function(res){
    return res.json()
})
.then(function(products){
    console.log(products)

    // 상품 정보에 대한 배열로부터 웹화면에 보여줄 DOM 객체로 이루어진 배열로 변환하기
    const productsRefined = products.map(buildElement)
    
    // DOM 객체로 이루어진 배열을 사용하여 웹 화면에 상품 정보 보여주기
    productsRefined.forEach(displayProduct)
})