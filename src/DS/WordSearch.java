package DS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class TrieNode{
	TrieNode[] children = new TrieNode[26];
	boolean isWord;
	TrieNode() {
		
	}
}

public class WordSearch {
	Set<String>  list = new HashSet<String>();
	public static void main(String s[]) {
		WordSearch search = new WordSearch();
		String[] dict = {"aaaaaaaaaaaa","aaaaaaaaaaaaa","aaaaaaaaaaab"};
		char[][] words = {{'a', 'a', 'a', 'a'},
				{'a', 'a', 'a', 'a'},
				{'a', 'a', 'a', 'a'},
				};
		TrieNode root = search.buildTrie(dict);
		search.searchWords(dict, words, root);
		System.out.println("List "+search.list);
		
	}
	
	public TrieNode buildTrie(String[] dict) {
		TrieNode root = new TrieNode();
		for(String word: dict) {
			TrieNode current = root;
			for(char c: word.toCharArray()) {
				int index = c-'a';
				if(current.children[index] == null)
					current.children[index] = new TrieNode();
				current = current.children[index];
			}
			current.isWord = true;
			
		}
		
		return root;
	}
	public void searchWords(String[] dict, char[][] word, TrieNode root) {
		TrieNode current = root;
		for(int i=0; i<word.length; i++) {
			for(int j=0; j<word[0].length; j++) {
				isValidWord(dict, word,  i,  j, -1, -1, word[i][j]+"", current);	
			}
		}
		
	}
	
	
	
	public void isValidWord(String[] dict, char[][] word, int i, int j, int parent_i, int parent_j, String s, TrieNode root) {
		
		if(isAWord(root, s))
		{
			if(s.length() <= (word.length * word[0].length))
			list.add(s);
		}
		
		if(isValidPrefix(root,s)) {
			//go up
			int index = i-1;
			if(index >=0 && !(index == parent_i  && j == parent_j))
				isValidWord(dict,  word, index, j, i, j, s+word[index][j], root);
			
			//go down
		    index = i+1;
			if(index < word.length && !(index == parent_i  && j == parent_j))
				isValidWord(dict,  word, index, j, i,  j, s+word[index][j], root);
			
			//go right
		    index = j+1;
			if(index < word[0].length && !(index == parent_i  && j == parent_j))
				isValidWord(dict,  word, i, index, i,  j, s+word[i][index], root);
			
			index = j-1;
			if(index >=0 && !(index == parent_i  && j == parent_j))
				isValidWord(dict,  word, i, index, i,  j, s+word[i][index], root);
			
		}
		else {
			return;
		}	
	}
	
	private boolean isValidPrefix(TrieNode root, String s) {
		// TODO Auto-generated method stub
		TrieNode current = root;
		
		for(char c: s.toCharArray()) {
			int index = c-'a';
			if(current.children[index] == null)
				return false;
			current = current.children[index];
		}
		return true;
	}

	public boolean isAWord(TrieNode root, String s) {
		TrieNode current = root;
		
		for(char c: s.toCharArray()) {
			int index = c-'a';
			if(current.children[index] == null)
				return false;
			current = current.children[index];
		}
		return current.isWord;
	}
	
}
