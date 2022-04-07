<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<aside class="aside is-placed-left is-expanded">
  <div class="aside-tools">
    <div>
      標題 <b class="font-black">/不知道為什麼分兩個</b>
    </div>
  </div>
  <div class="menu is-menu-main">
    <p class="menu-label">第一小框(英文會全大寫)</p>
    <ul class="menu-list">
      <li class="--set-active-index-html">
        <a href="/myapp/message/viewAllOrders">        
          <span class="icon"><i class="mdi mdi-desktop-mac"></i></span>
          <span class="menu-item-label">第一個選項  目前會跳回這頁</span>
        </a>
      </li>
    </ul>
    <p class="menu-label">第二小框(英文會全大寫)</p>
    <ul class="menu-list">
      <li class="--set-active-tables-html">
        <a href="tables.html">
          <span class="icon"><i class="mdi mdi-table"></i></span>
          <span class="menu-item-label">一些表格</span>
        </a>
      </li>
      <li class="--set-active-forms-html">
        <a href="forms.html">
          <span class="icon"><i class="mdi mdi-square-edit-outline"></i></span>
          <span class="menu-item-label">一些輸入相關的工具</span>
        </a>
      </li>
      <li class="active">
        <a href="profile.html">
          <span class="icon"><i class="mdi mdi-account-circle"></i></span>
          <span class="menu-item-label">連到不知哪去</span>
        </a>
      </li>
      <li>
        <a href="login.html">
          <span class="icon"><i class="mdi mdi-lock"></i></span>
          <span class="menu-item-label">登入</span>
        </a>
      </li>
      <li>
        <a class="dropdown">
          <span class="icon"><i class="mdi mdi-view-list"></i></span>
          <span class="menu-item-label">選單有兩個分頁</span>
          <span class="icon"><i class="mdi mdi-plus"></i></span>
        </a>
        <ul>
          <li>
            <a href="#void">
              <span>分頁1 在原始碼上面的href指定路徑就可使用</span>
            </a>
          </li>
          <li>
            <a href="#void">  
              <span>分頁2  在原始碼上面的href指定路徑就可使用</span>
            </a>
          </li>
        </ul>
      </li>
    </ul>
    <p class="menu-label">第三小框(英文會全大寫)</p>
    <ul class="menu-list">
      <li>
        <a href="https://justboil.me" onclick="alert('Coming soon'); return false" target="_blank" class="has-icon">
          <span class="icon"><i class="mdi mdi-credit-card-outline"></i></span>
          <span class="menu-item-label">目前是一個跳窗的小功能</span>
        </a>
      </li>
      <li>
        <a href="https://justboil.me/tailwind-admin-templates" class="has-icon">
          <span class="icon"><i class="mdi mdi-help-circle"></i></span>
          <span class="menu-item-label">關於  </span>
        </a>
      </li>
      <li>
        <a href="https://github.com/justboil/admin-one-tailwind" class="has-icon">
          <span class="icon"><i class="mdi mdi-github-circle"></i></span>
          <span class="menu-item-label">原始碼的GitHub連結</span>
        </a>
      </li>
    </ul>
  </div>
</aside>