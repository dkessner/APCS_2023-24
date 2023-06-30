


html:
	jb build .

view:
	open _build/html/index.html

deploy:
	rm -r ../docs
	cp -r _build/html ../docs
	touch ../docs/.nojekyll

pdf:
	jb build . --builder pdflatex

viewpdf:
	open _build/latex/book.pdf

clean:
	jb clean .

