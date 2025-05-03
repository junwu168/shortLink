![Hutool](https://img.shields.io/badge/Hutool-5.8.27-informational.svg) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0.7-brightgreen.svg) ![Spring Cloud Alibaba](https://img.shields.io/badge/Spring%20Cloud%20Alibaba-2022.0.0.0--RC2-orange.svg) ![MyBatis-Plus](https://img.shields.io/badge/MyBatis--Plus-3.5.3.1-important.svg) ![ShardingSphere](https://img.shields.io/badge/ShardingSphere-5.3.2-critical.svg)

## 简介
短链接服务是通过特定算法或服务将一个原始长URL转换成更短的URL，仅仅包含几个字符。
具体转换流程如下

- **生成唯一标识符**：当注册一个原始URL的时候，短链接服务生成一个唯一标识
- **将标识与长URL关联**：通过数据库持久化储存，将唯一标识和提供的长URL关联起来
- **创建短链接**：成功唯一标识符加上域名，构成一个完整的短链接。
- **重新定向**：用户访问短链接时，实际是发送了长URL查询请求，服务会查询并重新定向到对应的长URL。
- **数据记录**：访问短链接的时候，服务会记录用户数据，比如访问量，来源，地理位置等。为后续分析用户行为提供数据。

<img width="1361" alt="image" src="https://github.com/user-attachments/assets/f4f93b16-abea-4b83-a55e-97f7bb1c3083" />
<img width="1361" alt="image" src="https://github.com/user-attachments/assets/c9debe6e-d5af-4b08-87c0-1a337df70aae" />
<img width="1361" alt="image" src="https://github.com/user-attachments/assets/dd1893e1-1269-4da5-8a4d-0b45ae773142" />


