//products - 원본배열 

//1)if(만약 price 버튼 클릭했으면 => sort => products.sort())
//2)if(만약 사용자가 검색창에 뭔가 입력했으면 ) => products.filter()

const rootDiv = document.getElementById('root') // 화면에 리스트를 보여줄 위치
const priceBtn = document.getElementById('price-btn') // 가격 정렬 버튼
const searchInput = document.getElementById('search-input') // 사용자 상품 검색창
const API_URL = 'http://makeup-api.herokuapp.com/api/v1/products.json?brand=maybelline' // API 주소

let shouldSort = false // 정렬여부 판단
let shouldFilter = false // 검색여부 판단
let originalProducts = null  //원본데이터를 저장할 변수 
let keyword = ''


function buildElement(product) { //product 만들기 
    const item = document.createElement('div')
    item.className = 'product'
    item.innerHTML = ` 
        <div class='product-img'><img src=${product.image_link} alt=${product.name}/></div>
        <div class='product-name'>${product.name} ($${product.price})</div>
        <div class='product-description'>${product.description}</div>
        <div class='product-type'>${product.product_type}</div>
    `
    return item //만든 아이템 리턴 
}
function displayProducts(products) { //디스플레이 함수 
    rootDiv.innerHTML = '' // 리스트 초기화
    products.forEach(product => { //각각의 product를 rootDiv에 붙이기 
        rootDiv.appendChild(buildElement(product))
    })
}

function updateProducts(products, keyword) {//원본데이터와 입력한키워드를 매개변수로 받음  
    // 조건 쿼리 (conditional query)
    let newProducts = [...products] // 원본배열을 함수 내부에서 지역변수에 복사
    if (shouldFilter) { //제품의 타입을 소문자로 바꾼다음 그것에 소문자로 바꾼 키워드가 포함되어 있는 것을 필터함 
        newProducts = newProducts.filter(product => product.product_type.toLowerCase().includes(keyword.toLowerCase()))
    }
    if (shouldSort) {//가격순으로 오름차순으로 정렬 
        newProducts.sort((p1, p2) => parseFloat(p1.price) - parseFloat(p2.price))
    }
    return newProducts //입력한 것만 포함하는 제품만 리턴함 
}

function sortByPrice() { //가격 오름차순으로 정렬
    shouldSort = !shouldSort //shouldSort 가 초기값이 false인데 반대 의미는 true라는것

    const newProducts = updateProducts(originalProducts, keyword) // 정렬 및 검색 
    displayProducts(newProducts) // 정렬 및 검색된 새로운 배열을 화면에 보여주기
}

function searchProducts(e) {
    shouldFilter = e.target.value !== '' //입력한 것이 있는 것을 담는 변수 
    keyword = e.target.value //입력한 내용을 keyword변수에 담음 

    const newProducts = updateProducts(originalProducts, keyword) // 정렬 및 검색
    displayProducts(newProducts) // 정렬 및 검색된 새로운 배열을 화면에 보여주기
}

// 서버에서 데이터 가져오기
fetch(API_URL)
    .then(function (res) {
        return res.json()
    })
    .then(function (products) {
        originalProducts = products // 원본 데이터 저장
        displayProducts(products) // 상품 정보 디스플레이하기 (초기 렌더링)

        priceBtn.addEventListener('click', sortByPrice) //버튼 누르면 sortByPrice함수 호출- 가격 오름차순으로 정렬
        searchInput.addEventListener('input', searchProducts)
    })