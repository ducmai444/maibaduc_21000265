# Git là gì?
Git là một hệ thống quản lý phiên bản phân tán (Distributed Version Control System – DVCS), nó là một trong những hệ thống quản lý phiên bản phân tán phổ biến nhất hiện nay. Git cung cấp cho mỗi lập trình viên kho lưu trữ (repository) riêng chứa toàn bộ lịch sử thay đổi.

# Git có lợi ích gì?
 - Dễ sử dụng, thao tác nhanh, gọn, lẹ và rất an toàn.
 - Dễ dàng kết hợp các phân nhánh (branch), có thể giúp quy trình làm việc code theo nhóm đơn giản hơn rất nhiều.
 - Chỉ cần clone mã nguồn từ kho chứa hoặc clone một phiên bản thay đổi nào đó từ kho chứa, hoặc một nhánh nào đó từ kho chứa là bạn có thể làm việc ở mọi lúc mọi nơi.
 - Deployment sản phẩm của bạn một cách không thể nào dễ dàng hơn.

# Các lệnh git cơ bản
1. git config
* Để kiểm tra tên và kiểu email trong cấu hình dùng git config  -- global và git config -- global user.email..
* Để set email hoặc tên mới git config -- global usee.name = "User name" và git config -- global user.email = "useremail@gmail.com".
2. git init
* Dùng để khởi tạo 1 git repository.
3. git clone
* Copy 1 git repository từ remote source.
4. git status
* Để check trạng thái của những file bạn đã thay đổi trong thư mục làm việc.
5. git add
* Thêm thay đổi đến stage/index trong thư mục làm việc.
6. git commit
* Một hành động để git lưu lại một snapshot của các sự thay đổi trong thư mục làm việc.
7. git push/git pull
* Push hoặc Pull các thay đổi đến remote.
8. git branch
* Liệt kê tất cả các branch.
9. git checkout
* Chuyển sang branch khác.
10. git stash
* Lưu thay đổi không muốn commit ngay lập tức.
11. git merge
* Hợp 2 branch lại với nhau.

