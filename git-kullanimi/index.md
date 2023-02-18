# İleri Seviye Git komutları

## commit,diff,Log,Amend

- git log: commitleri gösterir
- git status: değişiklikleri gösterir
- git commit --amend: son comite ekleme yapar
- git commit --amend -m "" : son değişikleri ekler ve commit mesajını günceller
- git log -n 1: sadece son commiti getir
- git revert (commitid): girilen id deki değişikliği geriye çeker
- git reset --hard (commitid) : seçilen iddeki zamana gider ve aradaki herşeyi siler.
- git diff (commitid)..(commitid) dosyadı : iki komit arasındaki farklılıkları getirir.

## Branch işlemleri stash kavramı

- git branch: var olan branchleri gösterir
- git branch (custom branch name): yeni bir branch oluşturur
- git branch git checkout (branchname): girilen branche geçiş yapar
- git checkout -b branchname: yeni branch oluşturup ona geçiş yapar
- git branch -D branchname: o branch i siler
- git stach: son committeki tüm veriler stachta saklanır
- git stach list : eklenen commitler gözükür
- git stach clear: eklenen veriler silinir
- git stach pop : en üstteki kaydı geri getirir listeden kaldırır.
- git stach apply : en üstteki kaydı geri getirir listeden kaldırmaz.

## Merge, Rebase, Conflict

- git merge brnachname: bulunduğu brnachle girilen branchi birleştirir
- git merge --squash branch name: direk branchleri birleştirir ve commit yaptırtıt
- git rebase branchname: branch eklenir
