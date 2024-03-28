#!/bin/bash
# Чтобы запустить этот скрипт, выполните следующую команду в терминале:
# ./renamilka.sh <путь> <имя_директории_которую_копируем> <новое_имя_директории>

if [ "$#" -ne 3 ]; then
    echo "Пожалуйста, мне надо три параметра: <путь> <имя_директории_которую_копируем> <новое_имя_директории>"
    exit 1
fi

path="$1"
dir_name="$2"
new_dir_name="$3"

dir_name_cap="$(tr '[:lower:]' '[:upper:]' <<< ${2:0:1})${2:1}"
new_dir_name_cap="$(tr '[:lower:]' '[:upper:]' <<< ${3:0:1})${3:1}"


if cd "$path"; then
    echo "Успешно перешел в каталог: $(pwd)"
else
    echo "Не удалось перейти в каталог: $path"
    exit 2
fi

if [ -d "$dir_name" ]; then
    echo "Найдена директория: $dir_name"
else
    echo "Директория $dir_name не найдена"
    exit 3
fi

if cp -r "$dir_name" "$new_dir_name"; then
    echo "Успешно скопировал директорию $dir_name в $new_dir_name"
else
    echo "Не удалось скопировать директорию $dir_name в $new_dir_name"
    exit 4
fi

cd $new_dir_name

if [ -d "build" ]; then
    rm -rf build
    echo "Папка build удалена"
fi

echo "Переименовываю имена внутри файлов с lower case"
find . -type f -exec sed -i '' "s/$dir_name/$new_dir_name/g" {} \;

echo "Переименовываю имена внутри файлов с camel case"
find . -type f -exec sed -i '' "s/$dir_name_cap/$new_dir_name_cap/g" {} \;

echo "Переименовываю файлы в сamel case регистре"
find . -type f -name "${dir_name_cap}*" -exec sh -c 'x="{}"; y="$(echo "{}" | sed -E "s/'"${dir_name_cap}"'/'"${new_dir_name_cap}"'/g")"; mv "$x" "${y}"' \;

echo "Переименовываю файлы в lower case регистре"
find . -type f -name "*${dir_name}*" -exec sh -c 'x="{}"; y="$(echo "{}" | sed -E "s/'"${dir_name}"'/'"${new_dir_name}"'/g")"; mv "$x" "${y}"' \;

echo "Переименовываю папки"
find . -type d -name "*${dir_name}*" -depth -exec sh -c 'x="{}"; y="$(echo "{}" | sed -E "s/'"${dir_name}"'/'"${new_dir_name}"'/g")"; mv "$x" "${y}"' \;

echo "Готово"
