package DAO;

import org.jetbrains.annotations.NotNull;

public interface DAO<T1, T2> {
    public void create(@NotNull T1 value);
    public T1 read(@NotNull T2 value);
    public void update(@NotNull T1 value);
    public void delete(@NotNull T1 value);
}
