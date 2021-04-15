package ru.netology.domain;

public class LikesInfo {
    private int amountLike; //Кол-во лайков
    private String usersLike; //Пользователи (Фамилия Имя) поставившие отметку like.

    private boolean onOffLike1; //Стоит лайк или нет.

    public int getAmountLike() {
        return amountLike;
    }

    public void setAmountLike(int amountLike) {
        this.amountLike = amountLike;
    }

    public String getUsersLike() {
        return usersLike;
    }

    public void setUsersLike(String usersLike) {
        this.usersLike = usersLike;
    }

    public boolean isOnOffLike1() {
        return onOffLike1;
    }

    public void setOnOffLike1(boolean onOffLike1) {
        this.onOffLike1 = onOffLike1;
    }
}
