import { createRouter, createWebHistory } from "vue-router";
import LoginView from "../views/login/LoginView";
import CalendarView from "../views/calendar/CalendarView";
import LeaveRequestView from "../views/leaveRequest/LeaveRequestView";
import AdminView from "../views/admin/AdminView";
import HistoryView from "../views/mypage/history/HistoryView";


const routes = [
  {
    path: "/",
    name: "login",
    component: LoginView,
  },
  {
    path: "/calendar",
    name: "calendar",
    component: CalendarView,
  },
  {
    path: "/leaverequest",
    name: "leaveRequest",
    component: LeaveRequestView,
  },
  {
    path:"/admin",
    name: "AdminView",
    component : AdminView
  },
  {
    path:"/mypage/history",
    name: "HistoryView",
    component: HistoryView,
  }
];

const router = createRouter({
  history: createWebHistory("/"), // 또는 원하는 경로를 직접 입력해도 됩니다.
  routes, // 'routes: routes'와 동일
});

export default router;
