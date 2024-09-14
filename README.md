# Ứng Dụng Đặt Món Ăn ABC - Bài Tập Lớn

## Môn Học: Lập Trình Trên Thiết Bị Di Động

### Nhóm thực hiện:
- Phan Minh Quân - 2051052110
- Nguyễn Minh Nhật - 2051052092
- Mai Thanh Bình - 2051012011
- Nguyễn Mạnh Phương - 2051052105
- Võ Thiện Việt Quang - 2051012094
- Lê Đông Anh Kiệt - 2051052068
- Lớp: DH20CS01
- Giảng viên hướng dẫn: ThS. Lê Ngọc Hiếu

## Giới thiệu

Ứng dụng **ABC** hỗ trợ đặt món ăn từ các nhà hàng thông qua thiết bị di động, giúp khách hàng dễ dàng tìm kiếm và đặt món từ các nhà hàng ưa thích. Phần mềm này quản lý đơn hàng, lưu trữ các món ăn, và hỗ trợ báo cáo thông tin đơn hàng.

## Chức năng chính của phần mềm

- **Đặt món ăn**: Khách hàng chọn món ăn từ menu nhà hàng, sau đó ứng dụng đối chiếu trong cơ sở dữ liệu và tiến hành đặt món.
- **Quản lý thông tin nhà hàng và món ăn**: Lưu trữ và quản lý thông tin các món ăn và nhà hàng.
- **Lưu trữ đơn hàng**: Đơn hàng của khách hàng được lưu trữ để phục vụ báo cáo sau này.

## Quy trình nghiệp vụ

1. **Đăng ký tài khoản**: Người dùng nhập thông tin cá nhân và tạo tài khoản.
2. **Đăng nhập**: Người dùng đăng nhập vào ứng dụng bằng tài khoản đã tạo.
3. **Đặt món ăn**: Người dùng chọn món ăn, thêm vào giỏ hàng, kiểm tra và xác nhận đơn hàng.
4. **Đánh giá nhà hàng**: Người dùng có thể đánh giá nhà hàng và món ăn đã đặt.

## Mô hình cơ sở dữ liệu

Cơ sở dữ liệu của ứng dụng bao gồm các bảng như sau:

- **Food**: Lưu trữ thông tin các món ăn (tên món, giá, hình ảnh).
- **Nhà hàng**: Lưu trữ thông tin các nhà hàng (tên, địa chỉ, email, số điện thoại).
- **Đơn hàng**: Lưu trữ thông tin các đơn hàng đã đặt (trạng thái đơn hàng, tổng tiền, thời gian đặt hàng).
- **Chi tiết đơn hàng**: Chi tiết món ăn trong mỗi đơn hàng (số lượng, mã món ăn).
- **User**: Lưu trữ thông tin người dùng (tên, email, số điện thoại, tài khoản, mật khẩu).

## Công nghệ sử dụng

- **Android Studio**: IDE phát triển ứng dụng trên Android.
- **Java**: Ngôn ngữ lập trình chính cho ứng dụng di động.
- **Spring Boot**: Framework phát triển backend API.
- **Hibernate**: ORM framework làm việc với cơ sở dữ liệu MySQL.
- **Spring Security**: Bảo mật ứng dụng với cơ chế xác thực.
- **Retrofit**: Giao tiếp với server từ ứng dụng di động.
- **MySQL**: Hệ quản trị cơ sở dữ liệu.
- **Postman**: Công cụ kiểm thử API.

## Yêu cầu hệ thống

- **Android**: Phiên bản 5.0 trở lên.
- **Máy chủ**: Chạy Java 8 trở lên, hỗ trợ MySQL.
- **MySQL**: Phiên bản 5.6 hoặc cao hơn.

---

**Tháng 09 năm 2023**
