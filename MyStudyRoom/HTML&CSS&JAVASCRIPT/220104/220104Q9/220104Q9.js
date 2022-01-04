//* 연습과제 9
//헤더에 Price 버튼을 추가한 다음 버튼을 클릭하면 가격이 낮은 순으로 정렬해서 보여주고, 
//다시 버튼을 클릭하면 처음 화면에 보여주었던 것처럼 출력

const API_URL = 'http://makeup-api.herokuapp.com/api/v1/products.json?brand=maybelline' 

// 상품 정보에 대한 배열로부터 웹화면에 보여줄 DOM 객체로 이루어진 배열로 변환하기
// product 객체의 image_link, name, price, description 프로퍼티 사용하기
function buildElement(product){
   
    const item = document.createElement('div')
    item.className = 'product'
    item.innerHTML =`
        <div class ='product-img'><img src=${product.image_link} alt=${product.name}/></div>
        <div class ='product-name'>${product.name} (${product.price})</div>
        <div class = 'product-desciption'>${product.description}</div>`
        return item   
}



productList = []
productList1 = []
const sort_btn = document.getElementById('button')
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
    productList=[...products] //깊은 복사 
    productList1=[...products]
    // 상품 정보에 대한 배열로부터 웹화면에 보여줄 DOM 객체로 이루어진 배열로 변환하기
    const productsRefined = products.map(buildElement)
    
    // DOM 객체로 이루어진 배열을 사용하여 웹 화면에 상품 정보 보여주기
    productsRefined.forEach(displayProduct)

})
console.log(productList)

let state = false
function sortPrice(e){
    state =!state //반대값
    const productAll = document.querySelectorAll('.product')

    if(state){
        // 정렬
        // 보여주기
        productList.sort((a,b) => a.price - b.price)
        console.log(productList)
    
        //console.log(productAll)
        productAll.forEach((element)=> element.remove()) 
        const productsRefined = productList.map(buildElement)
        productsRefined.forEach(displayProduct)

    }else{
        // 보여주기
        productAll.forEach((element)=> element.remove()) 
        const productsRefined = productList1.map(buildElement)
        productsRefined.forEach(displayProduct)
    }
   // console.log(e.target)

   
    
    
    
    
    //다시 클릭하면 원래대로 돌아가기


}
document.addEventListener('click', sortPrice)