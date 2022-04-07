<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<nav id="navbar-main" class="navbar is-fixed-top">
	<div class="navbar-brand">
		<a class="navbar-item mobile-aside-button"> <span class="icon"><i
				class="mdi mdi-forwardburger mdi-24px"></i></span>
		</a>
		<div class="navbar-item">
			<div class="control">
				<input placeholder="這裡輸入點什麼..." class="input">
			</div>
		</div>
	</div>
	<div class="navbar-brand is-right">
		<a class="navbar-item --jb-navbar-menu-toggle"
			data-target="navbar-menu"> <span class="icon"><i
				class="mdi mdi-dots-vertical mdi-24px"></i></span>
		</a>
	</div>
	<div class="navbar-menu" id="navbar-menu">
		<div class="navbar-end">
			<div class="navbar-item dropdown has-divider">
				<a class="navbar-link"> <span class="icon"><i
						class="mdi mdi-menu"></i></span> <span>簡單的下拉表單</span> <span class="icon">
						<i class="mdi mdi-chevron-down"></i>
				</span>
				</a>
				<div class="navbar-dropdown">
					<a href="profile.html" class="navbar-item"> <span class="icon"><i
							class="mdi mdi-account"></i></span> <span>My Profile 連到不知道哪去</span>
					</a> <a class="navbar-item"> <span class="icon"><i
							class="mdi mdi-settings"></i></span> <span>Settings 沒功能</span>
					</a> <a class="navbar-item"> <span class="icon"><i
							class="mdi mdi-email"></i></span> <span>Messages 沒功能</span>
					</a>
					<hr class="navbar-divider">
					<a class="navbar-item"> <span class="icon"><i
							class="mdi mdi-logout"></i></span> <span>Log Out 沒功能</span>
					</a>
				</div>
			</div>
			<div class="navbar-item dropdown has-divider has-user-avatar">
				<a class="navbar-link">
					<div class="user-avatar">
						<img src="https://avatars.dicebear.com/v2/initials/john-doe.svg"
							alt="John Doe" class="rounded-full">
					</div>
					<div class="is-user-name">
						<span>使用者名稱</span>
					</div> <span class="icon"><i class="mdi mdi-chevron-down"></i></span>
				</a>
				<div class="navbar-dropdown">
					<a href="profile.html" class="navbar-item active"> <span
						class="icon"><i class="mdi mdi-account"></i></span> <span>My
							Profile 連到不知道哪去</span>
					</a> <a class="navbar-item"> <span class="icon"><i
							class="mdi mdi-settings"></i></span> <span>設定 沒功能</span>
					</a> <a class="navbar-item"> <span class="icon"><i
							class="mdi mdi-email"></i></span> <span>訊息 沒功能</span>
					</a>
					<hr class="navbar-divider">
					<a class="navbar-item"> <span class="icon"><i
							class="mdi mdi-logout"></i></span> <span>Log Out 沒功能</span>
					</a>
				</div>
			</div>
			<a href="https://justboil.me/tailwind-admin-templates"
				class="navbar-item has-divider desktop-icon-only"> <span
				class="icon"><i class="mdi mdi-help-circle-outline"></i></span> <span>關於</span>
			</a> <a href="https://github.com/justboil/admin-one-tailwind"
				class="navbar-item has-divider desktop-icon-only"> <span
				class="icon"><i class="mdi mdi-github-circle"></i></span> <span>原始檔</span>
			</a> <a title="Log out" class="navbar-item desktop-icon-only"> <span
				class="icon"><i class="mdi mdi-logout"></i></span> <span>登出</span>
			</a>
		</div>
	</div>
</nav>