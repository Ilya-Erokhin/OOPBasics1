package ru.netology.domain;

public class RepostsInfo {
    private int amountReposts; //Количество репостов.
    private String nameOwner; //имя пользователя, поделившегося публикацией
    private boolean canShare; //разрешено "Поделиться"

    public int getAmountReposts() {
        return amountReposts;
    }

    public void setAmountReposts(int amountReposts) {
        this.amountReposts = amountReposts;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public boolean isCanShare() {
        return canShare;
    }

    public void setCanShare(boolean canShare) {
        this.canShare = canShare;
    }
}
