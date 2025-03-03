# 😺 PPLOG<sup>●</sup> Backend

팀 MYAONG의 프로젝트 **PPLOG** 백엔드 리포지토리입니다.

서비스 소개 및 공통 문서는 [organization 페이지](https://github.com/orgs/KEA-5th-Myaong)에서 확인하실 수 있습니다.

각 micro service별 리포지토리는 아래에서 확인하실 수 있습니다.

<details>
<summary>기능별 리포지토리</summary>

[blog service](https://github.com/KEA-5th-Myaong/blog-service) — 포스트 및 프로필 관리, 커뮤니케이션

[face expression service](https://github.com/KEA-5th-Myaong/face-expression-service) — 모의 면접 표정 분석

[member service](https://github.com/KEA-5th-Myaong/member-service) — 회원 가입, 계정 인증/인가

[personal statement service](https://github.com/KEA-5th-Myaong/ps-service) — 자기소개서 관리 및 첨삭

[portfolio service](https://github.com/KEA-5th-Myaong/portfolio-service) — 포트폴리오 관리

[preferred job service](https://github.com/KEA-5th-Myaong/prejob-service) — 관심 직군 설정 및 관리

[inquiry service](https://github.com/KEA-5th-Myaong/inquiry-service) — 문의사항

[interview service](https://github.com/KEA-5th-Myaong/interview-service) — AI 모의면접

[notification service](https://github.com/KEA-5th-Myaong/notification-service) — 알림 처리

[kafka streams](https://github.com/KEA-5th-Myaong/streams) — Kafka Streams (post table CDC)
</details>
    
<details>
<summary>서비스 메시</summary>
  
[api gateway](https://github.com/KEA-5th-Myaong/apigateway-service) — API Gateway

[config](https://github.com/KEA-5th-Myaong/config-service) — 서비스별 환경변수 중앙 관리

[discovery](https://github.com/KEA-5th-Myaong/discovery-service) — 로컬 및 온프레미스 환경에서 discovery
</details>


## 📐 설계

### ERD

- **전체**
    
    색이 다른 것끼리는 실제로는 FK로 설정되어 있지 않음
    
    공지사항 서비스는 후순위 기능으로, 개발되지 않음
    
    블로그(청록), 문의(노랑) 서비스는 회원 정보를 자주 참조할 필요가 있어 별도로 회원 정보를 저장하는 테이블을 추가 구성
  
    ![전체ERD](https://github.com/user-attachments/assets/4bfb0f6b-bcf8-4975-bf98-329f52b1babe)
    
- **서비스별**
    
    - 회원 서비스

      ![회원ERD](https://github.com/user-attachments/assets/594ade5d-d60c-445c-80b8-e96243f7e353)

    - 관심 직군 서비스
    
      ![관심직군ERD](https://github.com/user-attachments/assets/33ed0850-29c4-4627-8c89-b9a25040e915)
    
    - 블로그 서비스
  
      ![블로그ERD](https://github.com/user-attachments/assets/aaa08ecc-254a-4e23-b592-9d70b90d7d8b)

    - 모의 면접 서비스, 포트폴리오 서비스
    
      ![모의면접포폴ERD](https://github.com/user-attachments/assets/abdf0cb8-b4a9-4f53-8b32-15a84e356958)

    - 알림 서비스, 자기소개서 서비스
    
      ![알림자소서ERD](https://github.com/user-attachments/assets/34da3d0a-9991-415d-be8e-c88fcf06e88d)

    - 문의 서비스
    
      ![문의ERD](https://github.com/user-attachments/assets/4c09e935-5983-4ccd-8ad9-f807ed4e3be8)
    

### Architecture

MSA를 채택

표정 분석 서버는 Fast API로 별도 구성

![아키텍처](https://github.com/user-attachments/assets/22810031-0f72-400f-822d-65964c2c3a19)

### CI/CD Pipeline

**Dev**

![CICD_dev](https://github.com/user-attachments/assets/b978b5ea-a3cb-4551-a994-9e8167ba199f)

**Prod**

![CICD_prod](https://github.com/user-attachments/assets/18350b45-0bc3-4efb-a46c-d923efd390c4)

## 🧑‍💻 역할 분배

- 강수진
    - CDC 구현(MySQL post 테이블 → Elasticsearch)
    - DB 설계, 도메인 매핑, API 구현(블로그 홈, 포트폴리오), 이미지 처리 관련 로직 구현
- 김민형
    - CI/CD 파이프라인, K8s 클러스터, 모니터링 등 인프라 구성
    - DB 설계, Spring Cloud 서비스 메시 구성, Spring Security 구성, API 구현(회원(사용자, 관리자)), Feign Client 연결 (회원)
- 양시훈
    - API 구현(관심 직군, 자기소개서, 문의, 블로그(관리자))
- 조기헌
    - API 구현(블로그(사용자), 모의 면접, 알림), Feign Client 연결(알림), AI 연동, GPT 연동
- 최현준
    - AI 개발(모의 면접 질문 생성, 표정 분석)
    - API 구현(표정 분석)

## 🛠️ 기술 스택

**Server**

- Java 17, Spring Boot 3.3.4
- Spring Web MVC
- Spring Security, jjwt 0.11.3
- Spring Cloud, Spring Cloud Config, Spring Cloud Netflix(Eureka), Spring Cloud Kubernetes
- AWS SDK(S3 API)
- Swagger

**Data**

- Spring Data JPA, QueryDSL 5.0.0, Spring Data Redis
- MySQL, H2 (local), Redis, Elasticsearch, Kafka

**Build**

- Gradle 8.10.2

**CI/CD, Infra**

- Jenkins
- Docker, Kubernetes
- Prometheus, Grafana
- Kakao Cloud
- Oracle Cloud Infrastructure (Kakao Cloud 사용 제한으로 인해 사용)

**Communication**

- Discord, Slack, Github

## ✏️ Convention

### Git Convention

- Git Flow 사용
- 개발 절차
    1. Github Repository에서 issue 생성
    2. Jira에서 issue 생성 후 branch 생성
    3. add → commit → push → pull request
    4. code review
    5. pull request를 develop branch로 merge
    6. 종료된 issue close 및 delete branch
- Branch : `<prefix>/#<Issue_Number>-<description>/<Jira_label_Number>`
- Issue Naming : `[<PREFIX>] <Description>`
- Commit Message : `:gitmoji:[#<Issue_Number>] <prefix> <Description>`
- Gitmoji
    
    | prefix | gitmoji | 의미 |
    | --- | --- | --- |
    | feature (FEAT) | `:sparkles:` (✨) | 새로운 기능 구현 |
    | fix | `:hammer:` (🔨) | 수정 |
    | refactor(REFAC) | `:recycle:` (♻️) | 리팩토링 |
    | chore | `:wrench:` (🔧) | 패키지 구조 수정, code와 무관한 부분들 (.gitignore, build.gradle 같은) 수정 |
    | docs | `:memo:` (📝) | 문서 수정 |
    | comment | `:memo:` (📝) | 주석 추가 |
    | test | `:white_check_mark:` (✅) | 테스트 코드, 리펙토링 테스트 코드 추가 |
    | rename | `:truck:` (🚚) | 패키지나 클래스명 수정 |
    | remove | `:fire:` (🔥) | 패키지나 클래스 삭제 |

### Code

**Naming**

- 클래스 : **PascalCase,** and·or와 같은 접속사를 사용하지 않고 25자 내외로 작성합니다.
    - 각 패키지명을 접미사에 명시합니다.
    - 구현체의 경우 ~Impl를 접미사에 추가합니다. (ex. UserServiceImpl, UserRepositoryImpl)
- 함수 : **camelCase**
    - 메소드 작성 순서는 public 밑에 private입니다. 모든 public 메소드 밑에서부터 모든 private 메소드가 정의됩니다.
    - event, design과 같은 이중적인 단어를 가지는 단어는 지양합니다.
    - 메소드의 부수효과를 구체적으로 설명합니다.
    - 의도가 전달되도록 최대한 간결하게 표현합니다.
    - 메소드의 목적을 동사로 표현해 메소드의 앞에 붙입니다.
- 변수 : **camelCase**
- DB 테이블 : **snake_case**
- 상수 : **SCREAMING_SNAKE_CASE**
- 컬렉션(Collection) : **복수형**을 사용합니다. (Ex. users, userList)

**Package**

```
microservice
├─common
│ └─advice
├─config
├─controller
├─dto
│ ├─request
│ └─response
├─entity
├─enums
├─repository
└─service
```
