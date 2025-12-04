	.def	@feat.00;
	.scl	3;
	.type	0;
	.endef
	.globl	@feat.00
@feat.00 = 0
	.file	"e33.ll"
	.def	main;
	.scl	2;
	.type	32;
	.endef
	.text
	.globl	main                            # -- Begin function main
	.p2align	4
main:                                   # @main
.seh_proc main
# %bb.0:                                # %entry
	subq	$40, %rsp
	.seh_stackalloc 40
	.seh_endprologue
	movl	$0, 32(%rsp)
.LBB0_1:                                # %while.cond
                                        # =>This Inner Loop Header: Depth=1
	cmpl	$3, 32(%rsp)
	jge	.LBB0_3
# %bb.2:                                # %while.body
                                        #   in Loop: Header=BB0_1 Depth=1
	cmpl	$1, 32(%rsp)
	je	.LBB0_4
	jmp	.LBB0_5
.LBB0_3:                                # %while.end
	movl	$0, 36(%rsp)
	jmp	.LBB0_7
.LBB0_4:                                # %if.then
                                        #   in Loop: Header=BB0_1 Depth=1
	leaq	.str.0(%rip), %rdx
	leaq	.str.1(%rip), %rcx
	callq	printf
	jmp	.LBB0_6
.LBB0_5:                                # %if.else
                                        #   in Loop: Header=BB0_1 Depth=1
	leaq	.str.2(%rip), %rdx
	leaq	.str.1(%rip), %rcx
	callq	printf
.LBB0_6:                                # %if.end
                                        #   in Loop: Header=BB0_1 Depth=1
	movl	32(%rsp), %eax
	addl	$1, %eax
	movl	%eax, 32(%rsp)
	jmp	.LBB0_1
.LBB0_7:                                # %for.cond
                                        # =>This Inner Loop Header: Depth=1
	cmpl	$2, 36(%rsp)
	jge	.LBB0_10
# %bb.8:                                # %for.body
                                        #   in Loop: Header=BB0_7 Depth=1
	movl	36(%rsp), %edx
	leaq	.str.3(%rip), %rcx
	callq	printf
# %bb.9:                                # %for.update
                                        #   in Loop: Header=BB0_7 Depth=1
	movl	36(%rsp), %eax
	addl	$1, %eax
	movl	%eax, 36(%rsp)
	jmp	.LBB0_7
.LBB0_10:                               # %for.end
	xorl	%eax, %eax
	.seh_startepilogue
	addq	$40, %rsp
	.seh_endepilogue
	retq
	.seh_endproc
                                        # -- End function
	.section	.rdata,"dr"
	.globl	.str.0                          # @.str.0
.str.0:
	.asciz	"um"

	.globl	.str.1                          # @.str.1
.str.1:
	.asciz	"%s\\n"

	.globl	.str.2                          # @.str.2
.str.2:
	.asciz	"outro"

	.globl	.str.3                          # @.str.3
.str.3:
	.asciz	"%d\\n"

	.addrsig
	.addrsig_sym printf
	.addrsig_sym .str.0
	.addrsig_sym .str.1
	.addrsig_sym .str.2
	.addrsig_sym .str.3
