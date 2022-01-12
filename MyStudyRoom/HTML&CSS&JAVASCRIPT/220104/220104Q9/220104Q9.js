//* 연습과제 9
//헤더에 Price 버튼을 추가한 다음 버튼을 클릭하면 가격이 낮은 순으로 정렬해서 보여주고, 
//다시 버튼을 클릭하면 처음 화면에 보여주었던 것처럼 출력

const API_URL = 'http://makeup-api.herokuapp.com/api/v1/products.json?brand=maybelline' 

// 상품 정보에 대한 배열로부터 웹화면에 보여줄 DOM 객체로 이루어진 배열로 변환하기
// product 객체의 image_link, name, price, description 프로퍼티 사용하기
function buildElement(product){
   
    const item = document.createElement('div') //돔 객체 생성 -이미지, 이름, 디스크립션을 포함
    item.className = 'product' //각각의 돔 클래스 이름 지정 
    item.innerHTML =`
        <div class ='product-img'><img src=${product.image_link} alt=${product.name}/></div>
        <div class ='product-name'>${product.name} (${product.price})</div>
        <div class = 'product-desciption'>${product.description}</div>`
        return item   //돔 생성 후 리턴 
}


productList = [] //빈 배열
productList1 = [] //빈 배열 
const sort_btn = document.getElementById('button') //버튼의 돔객체 

// DOM 객체로 이루어진 배열을 사용하여 웹 화면에 상품 정보 보여주기
function displayProduct(product){
   root.append(product) //html body 의  root에 만든 돔객체 product 붙이기 
}

fetch(API_URL)
.then(function(res){
    return res.json()
})
.then(function(products){
    console.log(products)
    productList=[...products] //깊은 복사 -> 배열의 요소까지 복사 
    productList1=[...products] //깊은 복사 
    // 상품 정보에 대한 배열로부터 웹화면에 보여줄 DOM 객체로 이루어진 배열로 변환하기
    const productsRefined = products.map(buildElement)
    
    // DOM 객체로 이루어진 배열을 사용하여 웹 화면에 상품 정보 보여주기
    productsRefined.forEach(displayProduct)

})
console.log(productList)

let state = false
function sortPrice(e){ //클릭 이벤트를 매개변수로 받음 
    state =!state //=!반대값
    const productAll = document.querySelectorAll('.product') //모든 돔 객체 product를 묶는 변수 

    if(state){
        // 정렬
        // 보여주기
        productList.sort((a,b) => a.price - b.price) //가격 기준으로 오름차순 정렬 
        console.log(productList)
    
        //console.log(productAll)
        productAll.forEach((element)=> element.remove()) //화면에 보이는 product들을 remove()로 지워주기 
        const productsRefined = productList.map(buildElement) //다시 product 돔객체 생성 
        productsRefined.forEach(displayProduct) //생성한 거 디스플레이 

    }else{
         //다시 클릭하면 원래대로 돌아가기
        productAll.forEach((element)=> element.remove())  //화면에 보이는 product들을 remove()로 지워주기
        const productsRefined = productList1.map(buildElement) //다시 product 돔객체 생성
        productsRefined.forEach(displayProduct) //생성한 거 디스플레이
    }
   // console.log(e.target)

}
document.addEventListener('click', sortPrice) //클릭하면 sortPrice함수 호출 