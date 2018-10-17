#!/usr/bin/perl/ -w

my $name=$ARGV[0];
my $file=$ARGV[1];

($name and $file) or die <<HELP

This script will prepare the input fasta files for the qiime pipeline, 
by renaming each sequence's IDs to include the sample ID

Usage "perl $0 sampleID 16SFastaFile.fa > formatedFasta.fa"


HELP
;
open (FILE,"<",$file) or die "Cannot read file: $file: $!\n";
my $id=1;
my $f="";
while(<FILE>)
  {
  chomp;
   my $data2=$_;
    if($data2=~/^>/)
      {
	$data2=~s/>//g;	
	print ">${name}_$id $data2 sample=$name\n";
	$f="";
	$id++;	
      }
    else
      {
	print "$data2\n";
     }
  }
close (FILE);



