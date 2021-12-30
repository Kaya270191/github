#!/usr/bin/env python
# coding: utf-8

# ## Step1. 탐색 : 데이터의 기초 정보 살펴보기

# ### Chipotle 데이터셋의 기본정보 

# In[1]:


#pandas 모듈 임포트
import pandas as pd

#read_csv() 함수로 데이터를 Dataframe 형태로 불러옵니다. 
#pd.read_csv("파일 경로를 포함한 파일명", sep = "구분자")
#raw data를 상대 경로로 불러오기 
file_path = '../data/chipotle.tsv'
chipo = pd.read_csv(file_path, sep="\t") #불러들인 파일의 정보를 chipo 변수에 담는다

chipo.shape #shape() 데이터의 행,열 크기 반환

print(chipo.info()) #info() 행, 열의 구성정보 


# In[2]:


#head() 데이터 프레임에서 위에서부터 10개의 데이터 보여주기
#tail() 밑에서 부터 데이터 보여주기
chipo.head(10)
chipo.tail()


# In[3]:


#columns()함수로 컴럼의 정보를 보여줌
chipo.columns


# In[4]:


#인덱스의 범위
chipo.index


# ### quantity 와 item_price의 요약 통계
# 
# ### describe() 수치형 요약통계

# In[5]:


#describe() 함수로 요약통계량 출력하기 -> 수치형만!!
chipo.describe()

#count 수
#mean 평균
#std 표준편차
#min 최소값
#25% 사분의 일
#50% 사분의 이 


# In[6]:


#order_id는 숫자의 의미를 가지지 않기 때문에 문자타입(str)으로 변환 
chipo['order_id'] = chipo['order_id'].astype(str)
chipo.describe()


# ### unique() 로 범주형 피처의 개수 출력하기

# In[7]:


#order_id 개수 출력(중복되는 것 빼고 길이구함)
len(chipo['order_id'].unique()) #unique() 중복되는 것 빼고 고유한 범주


# In[8]:


#item_name 개수 출력 
len(chipo['item_name'].unique())


# ## Step2. 인사이트 발견: 탐색과 시각화
# 
# ### .value_counts()[:5]  -> 가장 많이 주문한 것 순서대로, 시리즈 객체에만 적용! 
# 

# In[9]:


#가장 많이 주문한 아이템 top10
chipo['item_name'].value_counts()[:10] #item_name 의 0번째부터 10번까지 숫자형 value 를 카운트함


# In[66]:


item_count = chipo['item_name'].value_counts()[:10]

#Top idx :  를 붙이기 위해 for문을 사용 
for idx,(itemName,count) in enumerate(item_count.iteritems(),1): #iteritems() 열을 순회하는 함수 . 1은 idx의 시작값
    print("Top", idx, ":", itemName, count)


# ### item당 주문 개수와 총량 구하기 groupby()

# In[11]:


#item 당 주문 개수를 출력합니다
#groupby() 함수는 데이터 프레임에서 특정 피처를 기준으로 그룹을 생성하여 이를 통해 그룹별 연산 적용
order_count = chipo.groupby('item_name')['order_id'].count() #item_name을 기준으로  주문한 아이디의 수를 구한다.
order_count[:10]


# In[13]:


#아이템별 주문총량
item_quantity = chipo.groupby('item_name')['quantity'].sum()#item_name을 기준으로 quantity의 합을 구한다
item_quantity[:10]


# # 시각화로 분석결과 살펴보기

# In[14]:


#get_ipython().run_line_magic('matplotlib', 'inline')
import numpy as np
import matplotlib.pyplot as plt


# In[44]:


#아이템별 주문의 총량을 막대 그래프로 시각화
#tolist()는 시리즈를 리스트로 변환하는 함수 

item_name_list = item_quantity.index.tolist() #item_quantity 의 index를 tolist() 1차원 리스트로 만듦

#numpy.arange(시작, 끝, 간격)으로 배열 만들기 
x_pos = np.arange(len(item_name_list)) #x축: item_name의 리스트의 길이
order_cnt = item_quantity.values.tolist() #item_quantity 의 value를 tolist() 1차원 리스트로 만듦

#bar()는 막대 그래프를 출력해주는 함수 bar(x축, y축)
plt.bar(x_pos, order_cnt, align='center')
plt.ylabel('ordered_item_count') # y라벨
plt.xlabel('ordered_item') # x라벨
plt.title('Distribution of all ordered item') #제목

plt.show()


# In[45]:


#아이템별 주문 개수 그래프

item_name_list = order_count.index.tolist() #item_quantity 의 index를 tolist() 1차원 리스트로 만듦

#numpy.arange(시작, 끝, 간격)으로 배열 만들기 
x_pos = np.arange(len(item_name_list)) #item_name의 리스트의 길이
order_cnt2 = order_count.values.tolist() #order_count 의 value를 tolist() 1차원 리스트로 만듦

#bar()는 막대 그래프를 출력해주는 함수 bar(x축, y축)
plt.bar(x_pos, order_cnt2, align='center')
plt.ylabel('ordered_item_count') # y라벨
plt.xlabel('ordered_item') # x라벨
plt.title('Distribution of all ordered item') #제목

plt.show()


# In[59]:


# 산점도

item_name_list = order_count.index.tolist() 


x_pos = np.arange(len(item_name_list)) 

order_cnt2 = order_count.values.tolist() 
order_cnt = item_quantity.values.tolist()


plt.scatter(x_pos, order_cnt2, s=order_cnt2,label="ordered_item_count", c="red", marker="*")
plt.scatter(x_pos, order_cnt, s=order_cnt, label= "total quantity of item", c="green", marker="^" )
plt.ylabel('ordered_item_count') 
plt.xlabel('ordered_item') 
plt.title('Distribution of all ordered item')
plt.legend(loc='upper left')

plt.show()


# ### 미니퀴즈 1-1
# ### pandas에서 유용하게 사용되는 함수 value_counts()와 unique()의 차이

# In[61]:


chipo['item_name'].value_counts()


# In[62]:


type(chipo['item_name'].value_counts()) #value_counts() 시리즈 


# In[63]:


chipo['item_name'].unique()


# In[64]:


type(chipo['item_name'].unique()) #unique() 배열 


# In[65]:


type(chipo['item_name'].unique().tolist()) #tolist() 1차원 배열로 만들어 줌 


# In[ ]:




