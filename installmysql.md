### 安装

```
$ brew update # 这是一个好习惯
$ brew install mysql

$ mysql.server start
$ mysql.server stop

$ mysql.server --help

$ mysqladmin -u root password 'new-password'
```

### 卸载

```
sudo rm /usr/local/mysql  
sudo rm -rf /usr/local/mysql*  
sudo rm -rf /Library/StartupItems/MySQLCOM  
sudo rm -rf /Library/PreferencePanes/My*  
vim /etc/hostconfig    

rm -rf ~/Library/PreferencePanes/My*  
sudo rm -rf /Library/Receipts/mysql*  
sudo rm -rf /Library/Receipts/MySQL*  
sudo rm -rf /var/db/receipts/com.mysql.*  

```