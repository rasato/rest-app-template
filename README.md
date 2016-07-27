# rest-app-template

Spring BootベースのRESTアプリケーション用プロジェクトテンプレートです。

プロジェクト構成は、[はじめてのSpring Boot](https://www.kohgakusha.co.jp/books/detail/978-4-7775-1865-4)を参考にしています。
Spring Bootでのアプリ開発が一通り試せるので、興味があればどうぞ。

## How to run?

```mvn spring-boot:run

## Specification

### Get all customers

access <BaseUrl>/api/customers with GET method.

### Get one customer

access <BaseUrl>/api/customers/<id> with GET method.

### Create customer

access <BaseUrl>/api/customes with POST method.
need parameters, "firstName" and "lastName". 

### Update customer

access <BaseUrl>/api/customers/<id> with PUT method.
need parameters, "firstName" and "lastName". 

### Delete customer
access <BaseUrl>/api/customers/<id> with DELETE method.

